<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/boardList.css">
<style type="text/css">
td{
	text-align: center;
}
html{
	background-color: gray;
}
body{
	background-color: white;
}
th{
	text-align: center;
}

</style>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$.ajax({
		type : 'GET',
		url : 'http://localhost:8080/test02/ajax',
		
		success : function(data) {
			
			$('#board_body').html(data);
		}
	});
});
</script>
</head>
<body>
<section class="notice">
  <div class="page-title">
        <div class="container">
            <h3>자유 게시판</h3>
        </div>
         <button type="button" class="btn btn-dark" id="write" style="margin-left: 23%;">게시글 작성</button>
         <button type="button" class="btn btn-dark" id="reload" style="margin-left: 38%;">새로고침</button>
            <script type="text/javascript">
            $('#write').click(function() {
    			location.href="add.do";
    		});
            $('#reload').click(function() {
            	console.log("새로고침");
            	$.ajax({
            		type : 'GET',
            		url : 'http://localhost:8080/test02/ajax',
            		
            		success : function(data) {
            			$('#board_body').html(data);
            		}
            	});
    		});
            
            
            </script>
    </div>

   
  <!-- board list area -->
    <div id="board-list" style="overflow-y:scroll; height:600px;">
        <div class="container">
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">글번호</th>
                    <th scope="col" class="th-title">제목</th>
                    <th scope="col" class="th-date">작성일자</th>
                </tr>
                </thead>
                <tbody id="board_body">
                </tbody>
                
            </table>
           
        </div>
    </div>

</section>
</body>
</html>