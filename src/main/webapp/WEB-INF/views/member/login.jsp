<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<h1>로그인</h1>
<form action="${pageContext.request.contextPath }/member/loginPro" method="post">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="pw"><br>
<input type="submit" value="로그인">
</form>
</body>
</html>