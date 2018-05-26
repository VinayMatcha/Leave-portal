<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee leave portal</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="resources/js/jquery-3.2.1.js"></script>
<script
	src="resources/js/bootstrap.js"></script>

<link rel="stylesheet"
	href="resources/css/login.css">

</head>
<body ng-app = "Data">
<div ng-controller = "userController">
    <div><button type="button" value="pV" ng-click="dataCn.test()">test</div>
    <div>{{ dataCn.value }} </div>
    <div>{{value}}</div>
</div>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular.min.js"></script>
<script type="text/javascript" src="resources/js/holiday.js"></script>
</html>