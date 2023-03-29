<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
String id = request.getParameter("id");
String[] list = {"root", "admin", "Heo"};

String result = "중복이 되지 않아, 사용 가능";
for (String item : list) {
	if (item.equals(id)) {
		result = "중복된 ID이므로, 사용 불가능";
		break; 
	}
}
%><%= result %>