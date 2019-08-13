<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>展示学生及家人信息</title>
</head>
<body>
  <h2>展示学生信息</h2>
  <br/>
  学生姓名为：${studentBean.studentName }<br/>
  学生性别为：${studentBean.studentSex }<br/>
  学生年龄为：${studentBean.studentAge }<br/>
<%--   开户银行为：${studentBean.studentAge }<br/>
  银行卡号为：${studentBean.studentAge }<br/> --%>
<%--   开户银行为：${studentBean.studentName }<br/>
  银行卡号为：${studentBean.studentName }<br/> --%>
  <c:forEach var="families" items="${studentBean.families }">
    &nbsp;&nbsp;&nbsp;&nbsp;家人与该生关系为：${families.fRelation }<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;家人姓名为：${families.fName }<br/>
  </c:forEach>

</body>
</html>