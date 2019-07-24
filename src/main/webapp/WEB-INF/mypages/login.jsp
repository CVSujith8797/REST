<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
Welcome to login page
<form method="post" action="/loginvalid">
UserName: <input type="text" name="username" class="form-control"><br>
Password: <input type="password" name="password" class="form-control"><br>
<input type="submit"class="btn btn-success" value="Submit">
</form>
</body>
</html>