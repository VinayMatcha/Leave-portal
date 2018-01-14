
$(document).ready(function(){
$("#login-submit").click(function(){
	var username,password;
	username = document.getElementById('username');
	password = document.getElementById('password');
	$.ajax({
		url : 'loginController',
		data : {username : username , password : password},
		success : function(responseText) {
			
			if(responseText== 'SUCCESS'){
				alert("Login Success");
			}
			
		}
	});
	console.log(username.value);
	console.log(password.value);
	if(username.value == password.value){
		alert("Login Success hard coded");
	}
	else{
		alert("Login Failure");
	}
});

$("username").focusout(function(){
    $("invalidUserName").show();
});
});