<%--
  Created by IntelliJ IDEA.
  User: hailin6
  Date: 2020/3/29
  Time: 1:40 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <s:head />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>

<s:form action="register">
    <s:textfield name="personBean.firstName" label="First name" />
    <s:textfield name="personBean.lastName" label="Last name" />
    <s:textfield name="personBean.email"  label ="Email"/>
    <s:textfield name="personBean.age"  label="Age"  />
    <s:submit/>
</s:form>
</body>
</html>
