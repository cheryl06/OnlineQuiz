/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



        function EvalQuiz() {
        
        var ans1 = ReadAnswer(1);
    	var ans2 = ReadAnswer(2);
    	var ans3 = ReadAnswer(3);
        var ans4 = ReadAnswer(4);
        var ans5 = ReadAnswer(5);
        
    	//adding up the value of answers to calculate the final score
        var ansString = "'" + ans1 + ',' + ans2 + ',' + ans3 + ',' + ans4 + ',' + ans5 + "'";
        
        var xmlhttp = new XMLHttpRequest();
        var url = "Check3"; // Check3 is the servlet performing the query to check the answers
        
        xmlhttp.onreadystatechange = function() {
            // readyState of 4 signifies request is complete & status of 200 signifies sucessful HTTP call
            if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
              
              // this would deal with what was sent as a JSON object
                var myArr = JSON.parse(xmlhttp.responseText);
            
                myFunction(myArr);
          
            }
        };
       
        xmlhttp.open("POST", url, true);
        var params = "ans=" + ansString;
        
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.setRequestHeader("Content-length", params.length);
        xmlhttp.setRequestHeader("Connection", "close");        
        


        xmlhttp.send(params);
      
    }




//the below function checks if the answer is correct, incorrect or unknown and accordingly calculates the score
    function myFunction(arr) {
    
    //setting correct, incorrect, unknown values as 0 to count the number of correct,incorrect or unknown answers
    var i, correct, incorrect, unknown, resultDiv ;
    correct = 0 ;
    incorrect = 0;
    unknown = 0 ;
    
    
    for(i = 0; i < arr.Addresses.length; i++) {
        
        resultDiv = document.getElementById("q" + arr.Addresses[i].Question + "Result") ;
        
            //fetches and checks answer fromm the Check3 servlet and if the answer selected is correct/incorrect/unknown
        resultDiv.innerHTML = arr.Addresses[i].Answer ;
        if (resultDiv.innerHTML === "Correct")//if correct display "Correct"
            ++correct ;
        
    }
    
    var msg = "" ;
    if (correct === arr.Addresses.length)   // Checks for how many answers are corect to display the score
        msg = "&nbsp;&nbsp;-&nbsp;&nbsp;<strong>Congratulations!</strong>";
    document.getElementById("score").innerHTML = "Your score is : " + correct + " / " + arr.Addresses.length + msg;

}




//the function below is to get the value from the checked radio button
function ReadAnswer(qNum) {
   
   //getting the question number and the question
    var qRadio = document.getElementsByName("question" + qNum) ;
  
  //checking for all questions
    for (var i=0; i < qRadio.length; i++)
    	{        //if answer for a question is checked/selected 
      		if (qRadio[i].checked) {
                    // then return the value of the answer
                    return qRadio[i].value;
                }
    	}
    	return "u";
}


