<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Event" %>
<%
Event redpepper = (Event) application.getAttribute("event");
%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-"8">
<title>イベント内容の確認</title>
<STYLE type="text/css"></STYLE>
</head>
<body>
<h1>タイトル画像</h1>
<h2>イベント内容の確認</h2>
<table>
	<tr>
		<th>イベント名：</th>
		<td><%= redpepper.getEventName() %></td>
	</tr>
	<tr>
		 <th>幹事者名：</th>
		<td><%= redpepper.getOrganizarName() %></td >
	 </tr>
	<tr>
		<th>イベント作成者</th>
		<td><%= redpepper.getAutherName() %></td >
	</tr>
	<tr>
		<th>場所：</th>
		<td><%= redpepper.getEventVenue() %></td>
	</tr>
	<tr>
		<th>一人分費用：</th>
		<td><%= redpepper.getPricePerPerson() %><td>
	</tr>
	<tr>
		<th>投稿締切日：</th>
		<td><%= redpepper.getDeadlineDay() %></td>
	</tr>
	<tr>
	<th>日程候補：</th>
		<td><%= redpepper.getYear(Candidate) %>年
			<%= redpepper.getMonth(Candidate) %>月
			<%= redpepper.getDay(Candidate) %>日
			<%= redpepper.getHour(Candidate) %>時
		</td>
	 </tr>
	 <tr>
		<th> 備考：</th>
		<td><%= redpepper.getAutherRemark() %></td>
	</tr>
	<tr>
		<td><%= if(redpepper.EventOpenFlag() == 0){ %>
		<% System.out.print("イベント一覧に載せる"); %>
		<% } %></td>
	</tr>
</table>
<p>URLを表示します
<a href=""></a></p>
</body>
</html>