<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.bit.model.BoardDto,java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<style>
        table.table2{
                border-collapse: separate;
                border-spacing: 1px;
                text-align: left;
                line-height: 1.5;
                border-top: 1px solid #ccc;
                margin : 20px 10px;
        }
        table.table2 tr {
                 width: 400px;
                 padding: 10px;
                font-weight: bold;
                vertical-align: top;
                border-bottom: 1px solid #ccc;
        }
        table.table2 td {
                 width: 600px;
                 padding: 10px;
                 vertical-align: top;
                 border-bottom: 1px solid #ccc;
        }
 
</style>
<body>
<%
String root=request.getContextPath();
%>
	<%
      BoardDto bean=(BoardDto)request.getAttribute("dto");
%>
	<div id="board_write">
		<table  style="padding-top:50px" align = center width=700 border=0 cellpadding=2 >
                <tr>
                <td height=20 align= center bgcolor=#ccc><font color=white> <%=bean.getNum() %>번째 게시글</font></td>
                </tr>
                <tr>
                <td bgcolor=white>
                <table class = "table2">
                        <tr>
                        <td>작성자</td>
                        <td><%=bean.getUserId() %></td>
                        </tr>
 
                        <tr>
                        <td>제목</td>
                        <td><%=bean.getSub() %></td>
                        </tr>
 
                        <tr>
                        <td>내용</td>
                        <td><%=bean.getContent() %></td>
                        </tr>
 
                        <tr>
                        <td>작성일자</td>
                        <td><%=bean.getNalja() %></td>
                        </tr>
                        </table>
 
                        <center>
                        <a href="edit.do?num=<%=bean.getNum()%>">수정</a>
						<a href="delete.do?num=<%=bean.getNum()%>">삭제</a>
						<a href="#"  onclick="history.back()">뒤로</a>
                        </center>
                </td>
                </tr>
        </table>
        
		<%-- <div>
			<div>
				<span>게시글 번호</span> <span><%=bean.getNum() %></span>
			</div>
			<div>
				<span>작성일자</span> <span><%=bean.getNalja() %></span>
			</div>
			<div>
				<span>작성자</span> <span><%=bean.getUserId() %></span> <span>제목</span>
				<span><%=bean.getSub() %></span>
			</div>
			<div>
				<span>내용</span> <span><%=bean.getContent() %></span>
			</div>
			<div>
				<a href="edit.do?num=<%=bean.getNum()%>">수정</a>
				<a href="delete.do?num=<%=bean.getNum()%>">삭제</a>
				<a href="#"  onclick="history.back()">뒤로</a>
			</div>
		</div> --%>
</html>