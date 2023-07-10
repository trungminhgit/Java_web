<%-- 
    Document   : index
    Created on : Jul 9, 2023, 2:04:35 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    
        <h1>Hello World!</h1>
        <ul>
            <c:forEach items="${products}" var="p">
                <li>${p.id} - ${p.name} - ${p.price}</li>
            </c:forEach>
        </ul>
    
</html>
