<%@page import="web03.MockVO"%>
<%@page import="web03.MockDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="web03.MockVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>
	<%
		MockDAO dao = new MockDAO();
		System.out.println(vo.toString());
		dao.insert(vo);
	%>