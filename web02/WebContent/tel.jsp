<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
    
    String tel = request.getParameter("tel");
    String result = "";
    String prefix = tel.substring(0, 3);
    switch(prefix) {
    case "010": result = "100"; break;
    case "011": result = "111"; break;
    default : result = "222";
    }
    
    Random r = new Random();
    result += (r.nextInt(900) + 100);
    %><%= result %>