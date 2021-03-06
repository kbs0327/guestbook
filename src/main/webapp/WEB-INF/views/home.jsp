<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no,target-densitydpi=medium-dpi">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta http-equiv="Content-Style-Type" content="text/css">
	<title>방명록</title>
	<link rel="stylesheet" href="resources/css/bootstrap/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/guestbook.css">
</head>
<body>
	<div class="guestbook_wrapper">
		<div class="jumbotron">
			<div class="input-container row">
				<form class="form-horizontal" action="/post">
				  <div class="input-box">
				    <label class="col-sm-2 control-label">Email</label>
				    <div class="col-sm-10">
				  	  <input type="text" class="form-control" name="inputEmail" placeholder="email@example.com"><br>
				    </div>
				  </div>
				  <div class="input-box">
				    <label for="inputPassword" class="col-sm-2 control-label">Password</label>
				    <div class="col-sm-10 interval">
				      <input type="password" class="form-control" name="inputPassword" placeholder="Password">
				    </div>
				  </div>
				  <div>
				  	<textarea id="addContent" name="inputContent" class="form-control no-resize" rows="7" cols="100" fixed="fixed"></textarea>
				  </div>
				  <div class="input-attach">
				  	<input class="attch" type="file" name="inputAttach">
				    <label class="control-label" id="inputFileName">첨부파일:aaa.txt</label>
				  </div>
				  <div class="button-group">
				  	<input class="btn btn-primary btn-sm" type="submit" value="저장">
				  	<input class="btn btn-info btn-sm" type="button" value="첨부">
				  	<input class="btn btn-warning btn-sm" type="button" value="취소">
				  </div>
				</form>
			</div>
		</div>
	</div>

	<script src="resources/js/jquery/jquery-1.11.2.min.js"></script>
	<script src="resources/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>
