<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <div align = "center">
        <h1>게시글 수정</h1>
        <a href="logout.do">Log-out</a>
        <hr>
            <form action = "updateMovie.do?movie_seq=${movie.movie_seq}" method="post" enctype="multipart/form-data">
            <input name="seq" type="hidden" value="${movie.movie_seq}"/>
            <table border="1">
                <tr>
                    <td bgcolor="orange" width="70">제목</td>
                    <td>
                    <input name="movie_title" type="text" value="${movie.movie_title}"/></td>
                </tr>
                
                    
                <tr>
                    <td bgcolor="orange">내용</td>
                     <td><textarea name="movie_content" rows="10" cols="40">
                    ${movie.movie_content}  </textarea>	</td>
                </tr>
                
                <tr>
	   				<td bgcolor="orange">업로드</td>
	   				<td align="left"><input type="file" name="uploadfile"></td>
	 			<tr>
                
                <tr>
                    <td colspan="2" align="center">
                    <input type="submit" value="글 수정">
                </td>
                </tr>	
            </table>
            </form>
            <hr>
            <a href="deleteMovie.do?movie_seq=${movie.movie_seq}">글삭제</a>&nbsp; &nbsp; &nbsp;
            <a href="getMovieList.do">글 목록</a>
        </div>

    
</body>
</html>