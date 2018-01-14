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
<script type="text/javascript" src="resources/js/login.js"></script>
<link rel="stylesheet"
	href="resources/css/login.css">

</head>
<body>

	<div class="col-lg-12 col-sm-12" style="margin-top: 10%">
		<div class="col-lg-4 col-sm-2"></div>
		<div class="col-lg-4 col-sm-8">
			<h2 align="center" id="title">Friends Leave Portal</h2>
			<div class="well well-lg">
				<div align="center">
					<form id="login-form" action="" method="post" role="form"
						style="display: block;">
						<div class="form-group">
							<input type="text" name="username" id="username" tabindex="1"
								class="form-control" placeholder="Username" value="">
							<div id="invalidUserName" style="display: none; text-align: right; color:red">*Invalid UserName</div>
						</div>
						<div class="form-group">
							<input type="password" name="password" id="password" tabindex="2"
								class="form-control" placeholder="Password">
						</div>

						<div class="row">
							<div class="form-group col-sm-6 " style="text-align: left;">
								<input type="checkbox" tabindex="3" class="" name="remember"
									id="remember"> <label for="remember"> Remember
									Me</label>
							</div>
							<div class="col-sm-6">
								<div style="text-align: right;"">
									<a href="#" tabindex="5" class="forgot-password">Forgot
										Password?</a>
								</div>
							</div>
						</div>


						<div class="form-group">
							<div class="row">
								<div class="col-sm-12 col-sm-offset-0">
									<input type="submit" name="login-submit" id="login-submit"
										tabindex="4" class="form-control btn btn-login" value="Log In">
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="col-lg-4 col-sm-2"></div>
	</div>
</body>
</html>