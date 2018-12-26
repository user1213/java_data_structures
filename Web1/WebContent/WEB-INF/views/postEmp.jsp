<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {
		background-color: #efefef;
		margin: 0;
		padding: 0;
		color: green;
	}
	#content {
		margin-left: auto;
		margin-right: auto;
		margin-top: 20px;
		padding: 20px;
		background-color: #fff;
		width: 600px;
		min-height: 600px;
		overflow: auto;
	}
	#content:hover {
		box-shadow: 0 0 3px 3px #ccc;
		-webkit-transition: 1s all;
	}
	.formLayout {
		width: 300px;
	}
	.formLayout label, .formLayout .text {
		width: 120px;
		display: inline-block;
		float: left;
	}
	.formLayout br {
		clear: both;
	}
</style>
</head>
<body>
<div id="content">
	<div class="formLayout">
		<label>Name: </label>
		<span class="text">${name}</span><br /><br />
		<label>Company: </label>
		<span class="text">${company}</span><br /><br />
		<label>Salary: </label>
		<span class="text">${salary}</span>
	</div>
</div>
</body>
</html>