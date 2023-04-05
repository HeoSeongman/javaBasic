<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    JSONObject json = new JSONObject();
    json.put("오늘의 날씨", "흐림");
    json.put("오늘의 온도", 15.8);
    json.put("오늘의 습도", 80);
    %><%= json.toJSONString() %>