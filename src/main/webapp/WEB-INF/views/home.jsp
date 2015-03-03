<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>방명록</title>
	
	<link rel="stylesheet" href="resources/css/bootstrap/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/guestbook.css">
</head>
<body>
	<div class="jumbotron">
		<div class="input-container row">
			<form class="form-horizontal">
			  <div class="input-box">
			    <label class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-10">
			  	  <input type="text" class="form-control" id="inputEmail" placeholder="email@example.com"><br>
			    </div>
			  </div>
			  <div class="input-box">
			    <label for="inputPassword" class="col-sm-2 control-label">Password</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control margin-bottom" id="addPassword" placeholder="Password">
			    </div>
			  </div>
			  <div class="form-group">
			  	<textarea id="addContent" class="form-control no-resize" rows="7" cols="100" fixed></textarea>
			  </div>
			  <div class="form-group">
			  	<input type="submit" value="저장">
			  	<input type="button" value="취소">
			  </div>
			</form>
		</div>
	</div>


<P>  The time on the server is ${serverTime}. </P>
	<script src="resources/js/jquery/jquery-1.11.2.min.js"></script>
	<script src="resources/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>
