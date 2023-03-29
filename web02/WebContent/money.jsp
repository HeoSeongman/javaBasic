<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
    
    int price = Integer.parseInt(request.getParameter("price"));
	String payment = request.getParameter("payment");
    
    switch (payment) {
    case "1": price -= 1000; break;
    case "2": price += 1000; break;
    }
    %><%= price %>