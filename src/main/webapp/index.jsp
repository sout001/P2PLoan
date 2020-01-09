<html>
<body>
<h2>Hello World!</h2>
<%--<%
    request.setAttribute("ctx",request.getContextPath());
%>
<a href="${ctx}/product/cars">跳转</a>--%>
<jsp:forward page="WEB-INF/jsp/index.jsp"></jsp:forward>
</body>
</html>
