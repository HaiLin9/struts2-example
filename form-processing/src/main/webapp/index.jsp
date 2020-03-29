<%--
  Created by IntelliJ IDEA.
  User: hailin6
  Date: 2020/3/25
  Time: 11:59 上午
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>

    <s:url action="hello" var="helloLink">
        <s:param name="userName">Bruce Phillips</s:param>
    </s:url>
<p><a href="${helloLink}">Hello Bruce Phillips</a></p>

<p>Get your own personal hello by filling out and submitting this form.</p>
<s:form action="hello">
    <s:textfield name="userName" label="Your name"/>
    <s:submit value="submit" />
</s:form>

<p><a href="register.jsp">Please register</a> for our prize drawing.</p>

</body>
</html>
