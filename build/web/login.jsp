<%-- 
    Document   : login.jsp
    Created on : Jan 13, 2015, 12:16:47 PM
    Author     : Cheryl 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js" type="text/javascript"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js" type="text/javascript"></script>
        <script src="include/json2.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="quiz.css" type="text/css" rel="stylesheet" />
        
        <script type="text/javascript">
            
            
            function EvalLogin(){
                //getting the username and password entered in the text box 
        var userName = document.getElementById("user").value;
        var userPass = document.getElementById("pass").value;
       
        var logStr = "'"+userName +", "+ userPass+"'";
        
        var xmlhttp = new XMLHttpRequest();
        var url = "ValidLogin"; //targetted to ValidLogin.java
      
        
        xmlhttp.onreadystatechange = function() {
           
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                  // this would deal with what was sent as a JSON object
                var myArr = JSON.parse(xmlhttp.responseText);
               
                myFunction(myArr);
                
            }
        }
        
        xmlhttp.open("POST", url, true);
        var params = "up=" + logStr;
        
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.setRequestHeader("Content-length", params.length);
        xmlhttp.setRequestHeader("Connection", "close");        

        xmlhttp.send(params);
        
    }
    
     function myFunction(arr) {
    
    
  
  if (arr.Addresses.length) {
           //if credentials match display showQuiz.jsp
                document.getElementById("result2").innerHTML = "" ;
        window.location = "showQuiz.jsp" ;
        
        }
    else {
        //else would say Invalid credentials
        document.getElementById("result2").innerHTML = "Invalid credentials" ;
    }

}
            
            
            
            
            
            
            
            
        </script>
            
            
            
            
        

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

        <br/>
        
        <h2>Please login to begin the test</h2>
        <form onSubmit="return false" id="loginForm">
                    
        <table align="center">
            <tr>
                <td>
                    <div id="result2" style="color:red"></div>
                </td>
                
            </tr>
            <tr>
                <td>
                    <strong> Username </strong>  
                </td>
                <td>
                    :
                </td>
                <td class="intro">
                    <input class="form-control" type="text" name="user" id="user" />
                </td>

            </tr>
            <tr>
                <td>
                    <strong>Password</strong>
                </td>
                <td>
                    :
                </td>
                <td class="intro">
                    <input class="form-control"  type="password" name="pass" id="pass" />
                </td>

            </tr>
            <tr>
                <td>
                    
                </td>
                <td>
                    
                </td>
                <td class="intro">
                    <div id="button">
                    <input type="button" class="btn btn-primary" name="sub" value="Login" id="sub" onClick="EvalLogin();" />
                    </div>
                </td>

            </tr>
        </table>
        </form>
    </body>
</html>
