<%-- 
    Document   : showQuiz.jsp
    Created on : Jan 13, 2015, 11:16:38 PM
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
        <script type="text/javascript" src="includes/quiz_ajax_json.js"></script>
             
  

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="cherylname">Welcome <%=session.getAttribute("userName")%> !!!</h1>
        <form onSubmit="return false" id="quizForm">
            <div class="wrap">
<div class="completequestion">
	<div class="Quest">
          1. At the end of a banquet 10 people shake hands with each other. How many handshakes will there be in total?  
	</div>
	<div class="ans">
		<input type="radio" name="question1" value="1" /> 100
		<input type="radio" name="question1" value="2" /> 20
		<input type="radio" name="question1" value="3" /> 45
                <input type="radio" name="question1" value="4" /> 50
                <input type="radio" name="question1" value="5" /> 90
	</div>
	<div class="Result" id="q1Result"></div>
</div>
<div class="completequestion">
	<div class="Quest">
            2. The day before the day before yesterday is three days after Saturday. What day is it today?
	</div>
	<div class="ans">
		<input type="radio" name="question2" value="1" /> Monday
		<input type="radio" name="question2" value="2" /> Tuesday
		<input type="radio" name="question2" value="3" /> Wednesday
                <input type="radio" name="question2" value="4" /> Thursday
                <input type="radio" name="question2" value="5" /> Friday
	</div>
	<div class="Result" id="q2Result"></div>
</div>
<div class="completequestion">
	<div class="Quest">
            3. Select the number that best completes the analogy
            10 : 6 :: 3 : ?
	</div>
	<div class="ans">
		<input type="radio" name="question3" value="1" /> 2
		<input type="radio" name="question3" value="2" /> 1
		<input type="radio" name="question3" value="3" /> -1
                <input type="radio" name="question3" value="4" /> 12
                <input type="radio" name="question3" value="5" /> 4
	</div>
	<div class="Result" id="q3Result"></div>
</div>
<div class="completequestion">
	<div class="Quest">
            4. Which number should come next in the series?
            1, 3, 6, 10, 15,
	</div>
	<div class="ans">
		<input type="radio" name="question4" value="1" /> 8
		<input type="radio" name="question4" value="2" /> 11
		<input type="radio" name="question4" value="3" /> 24
                <input type="radio" name="question4" value="4" /> 21
                <input type="radio" name="question4" value="5" /> 27
	</div>
	<div class="Result" id="q4Result"></div>
</div>
<div class="completequestion">
	<div class="Quest">
            5. Library is to book as book is to
                Binding, Copy, Page, Cover
	</div>
	<div class="ans">
		<input type="radio" name="question5" value="1" /> page
		<input type="radio" name="question5" value="2" /> copy
		<input type="radio" name="question5" value="3" /> binding
                <input type="radio" name="question5" value="4" /> cover
                <input type="radio" name="question5" value="5" /> book
	</div>
	<div class="Result" id="q5Result"></div>
        
</div>  
            <div class="score" id="score"></div>
    <br />
    
    <div class="chkanswer">   
        <input type="button" class="btn btn-success" name="Submit" value="Check Answers" onClick="EvalQuiz();" /></div>

            </div>
        
        
        </form>
    </body>
</html>
