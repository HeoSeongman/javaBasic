<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    int won = Integer.parseInt(request.getParameter("won"));
    int doller = 1283;
    int result = won / doller;
    %><%= result %>