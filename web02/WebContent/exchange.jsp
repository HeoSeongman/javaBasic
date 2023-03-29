<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    int money = Integer.parseInt(request.getParameter("money"));
    String base = request.getParameter("base");
    String target = request.getParameter("target");
    
    if (base.equals("won")) {
    	money /= 1300;
    } else {
    	money *= 1300;
    }
    
    %><%= money %>