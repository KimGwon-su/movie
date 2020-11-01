<%@page import="www.jcoding.kr.MovieInfo"%>
<%@page import="java.util.List"%>
<%@page import="www.jcoding.kr.MovieController"%>
<%@page import="www.jcoding.kr.NaverApi"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    MovieController movieController = new MovieController();
    List<MovieInfo> result = movieController.getMovieList(-1, "K");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=0 ; i<result.size(); i++){
	MovieInfo item = result.get(i);
%>


<%= item.getMovieNm() %>
<br>

<%} %>
</body>
</html>