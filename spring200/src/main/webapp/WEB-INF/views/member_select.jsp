<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1">
  <tr>
    <th>아이디</th>
    <th>비밀번호</th>
    <th>이름</th>
    <th>전화번호</th>
  </tr>
  <tr>
    <td>${vo.id }</td>
    <td>${vo.pw }</td>
    <td>${vo.name }</td>
    <td>${vo.tel }</td>
  </tr>
</table>