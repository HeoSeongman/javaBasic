<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    JSONObject json1 = new JSONObject();
    json1.put("high", 110000);
    json1.put("low", 104000);
    json1.put("end", 109000);
    JSONObject json11 = new JSONObject();
    json11.put("yesterday", json1.toString());
    
    JSONObject json2 = new JSONObject();
    json2.put("high", 110000);
    json2.put("low", 104000);
    json2.put("end", 109000);
    JSONObject json22 = new JSONObject();
    json22.put("today", json2.toJSONString());
    
    JSONArray array = new JSONArray();
    array.add(json11);
    array.add(json22);
    %><%= array.toJSONString() %>