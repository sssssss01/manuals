<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert movie</title>
</head>
<body>
  <div align="center">
	<h1>영화 등록</h1>
	<a href="logout.do">Log-out</a>
	<hr>
	<form action="insertMovie.do" method="post" enctype="multipart/form-data">
	<table border="1">
	 <tr>
                <td bgcolor="orange" width="70">장르</td>
                <td align="left">
                  <select name="movie_gen">
                     <option value="thriller">스릴러</option>
                     <option value="romance">로맨스</option>
                     <option value="horror">호러</option>
                     <option value="action">액션</option>
                  </select>
               </td>
           </tr>
	  <tr>
	    <td bgcolor="orange">제목</td>
	    <td align="left"><input type="text" name="movie_title" size="10"/></td>
	  </tr>
	  <tr>
	    <td bgcolor="orange">줄거리</td>
	    <td align="left"><textarea name="movie_content" cols="40" rows="10"></textarea></td>
	  </tr>
	  <tr>
	    <td bgcolor="orange" width="70">배우</td>
	    <td align="left"><input type="text" name="actor"></td>
	  </tr>
	  <tr>
	    <td bgcolor="orange" width="70">감독</td>
	    <td align="left"><input type="text" name="director"></td>
	  </tr>
	  <tr>
	   	<td bgcolor="orange">업로드</td>
	   	<td align="left"><input type="file" name="uploadfile"></td>
	  <tr>
	    <td colspan="2" align="center">
	    <input type="submit" value="새 게시글 등록" />
	  </td>
	  </tr>
	</table>
	</form>
	<hr>
	<a href="getMovieList.do">메인 페이지로 가기</a>
  </div>
</body>
</html>