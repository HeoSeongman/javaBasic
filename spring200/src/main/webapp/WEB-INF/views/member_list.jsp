<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1">
  <tr>
    <th>아이디</th>
    <th>비밀번호</th>
    <th>이름</th>
    <th>전화번호</th>
  </tr>
  <c:forEach items="${list }" var="item">
	  <tr>
	    <td>${item.id }</td>
	    <td>${item.pw }</td>
	    <td>${item.name }</td>
	    <td>${item.tel }</td>
	  </tr>
  </c:forEach>
</table>