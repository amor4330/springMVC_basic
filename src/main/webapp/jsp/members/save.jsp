<%@ page import="hello.servlet.domain.repository.MemberRepository" %>
<%@ page import="hello.servlet.domain.member.Member" %><%--
  Created by IntelliJ IDEA.
  User: LEE
  Date: 2024-07-09
  Time: 오후 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //request, response는 변수 선언하지 않아도 그냥 사용 가능
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("JspClass.jsp_service_method");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id = <%=member.getId()%></li>
    <li>username = <%=member.getUsername()%></li>
    <li>age = <%=member.getAge()%></li>
</ul>
<a href="/index.html">메인으로 돌아가기</a>
</body>
</html>
