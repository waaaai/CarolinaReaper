<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Event,java.util.List" %>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-"8">
<title>タイトル</title>
<!--
   function EVENT1() { window.alert("必須の部分に不手際があります")}
// -->
<STYLE type="text/css">
 <!--
.scr {
   overflow: scroll;   /* スクロール表示 */
   width : 600px;
   height: 200px;
 }
-->
</STYLE>
</head>
<body>
<h1>タイトル</h1>
<h2>イベント一覧</h2>
<DIV class="scr">

   <table border="1">

   <thead>
      <tr>
         <th width="150">イベント名</th>
         <th width="100">幹事名</th>
         <th width="100">場所</th>
         <th width="80">締切日</th>
         <th width="400">備考</th>
      </tr>
   </thead>
   <tbody>
   <% for(int i = 0;i<10;i++){%>
      <tr>
        <td><%= event.getEventNeme %></td>
        <td><%= event.getOrganizarName %></td>
        <td><%= event.getEventVenue %></td>
        <td><%= event.getDeadlineDay %></td>
        <td><%= event.getAutherRemark %></td>
      </tr>
  <% } %>
   </tbody>
   </table>
</DIV>
<h2>イベント作成</h2>

<table>
   <label>
      <tr>
         <th>イベント名：</th>
         <td><input type="text" name="eventName" size="40" required maxlength="20">必須</td>
      </tr>
   </label>
   <label>
      <tr>
         <th>幹事者名：</th>
         <td><input type="text" name="organizarName" size="40" required maxlength="20">必須</label></td >
      </tr>
   </label>
   <label>
      <tr>
         <th>イベント作成者</th>
         <td><input type="text" name="autherName" size="40" required maxlength="20"></label></td >
      </tr>
   </label>
      <tr>
         <th>場所：</th>
         <td> <input type="text" name="eventVenue" size="40" maxlength="20"></td>
      </tr>
   </label>
   <label>
      <tr>
         <th>一人分費用：</th>
         <td><input type="text" name="cost" size="40" maxlength="20"><td>
      </tr>
   </label>
   <label>
      <tr>
         <th>投稿締切日：</th>
         <td><input type="number" name="deadlineyear"required size="4" maxlength="4">年
            <input type="number" name="deadlinemonth" size="2"maxlength="2">月
            <input type="number" name="deadlineday" size="2" maxlength="2">日
            <input type="number" name="deadlinehour" size="2" maxlength="2">時
      </tr>
   <label>
      <tr>
         <th>日程候補：</th>
         <td><input type="number" name="year"required size="4" maxlength="4">年
            <input type="number" name="month" size="2"required maxlength="2">月
            <input type="number" name="day" size="2" required maxlength="2">日
            <input type="number" name="hour" size="2"required maxlength="2">時
            必須</td>
      </tr>
   </label>
   <label>
      <tr>
         <th> 備考：</th>
         <td><input type="text" name="memo" size="" maxlength="20"></td>
      </label>
   <label>
      <tr>
         <th>イベント一覧に載せる</th>
         <td>yes<input type="radio" name="eventOpenFlag" required value="1">
             no<input type="radio" name="eventOpenFlag" required value="0"></td>
      </tr>
   </label>
   <label>
      <tr>
         <th>幹事者用パスワード：</th>
        <td><input type="text" name="autherPass" size="20" required maxlength="20">必須</td>
      </tr>
   </label>
</table>
<a href="/eventconfirmed.jsp">
<input  type="submit" value="イベントを作成する" onclick="EVENT1()">
</body>
</html>