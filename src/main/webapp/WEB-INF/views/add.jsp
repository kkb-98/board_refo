<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@page import="com.bit.model.BoardDto,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기</title>
 
</head>
<style>
table{
	margin: 0px auto;
	margin-top: 5%;
}
</style>
<body>
 
    <table>
        <form method="post">
 		
            <colgroup>
                <col width="20%">
                <col width="80%">
            </colgroup>
 
            <table>
                <caption>게시판 글쓰기</caption>
                <tr>
                    <td>작성자</td>
                    <td><input type=text name=userId size=10 maxlength=8></td>
                </tr>
                <tr>
                    <td>제 목</td>
                    <td><input type=text name=sub></td>
                </tr>
                <tr>
                    <td>내 용</td>
                    <td><textarea name=content rows="10" cols="100"></textarea></td>
                </tr>
                <tr>
                    <td colspan=2><hr size=1></td>
                </tr>
                <tr>
                    <td colspan="3"><div align="center">
                            <input type="submit" value="등록">  
                            <input type="button" value="뒤로" onclick="history.back()">
                        </div>  </td>
                </tr>
            </table>
        </form>
    </table>
 
</body>
</html>
