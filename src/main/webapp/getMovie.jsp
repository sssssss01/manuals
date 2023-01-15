<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화소개 상세</title>
<style>
   div{
    width: 70%;     
   }
   
   img {
   width: 500px;
   heigth: 500px;
   }

</style>
</head>
<body>

<form action="getMovieList.do" method="post" enctype="multipart/form-data">
<input name="seq" type="hidden" value="${movie.movie_seq}">
    <div id ="search_mov">
        <fieldset>
        <input type="text" name="searchkeyword" placeholder="영화검색" onfocus="this.placeholder=''" onblur="this.placeholder='영화검색'">
        <input type="submit" value="검색">
        </fieldset>
    </div>

	<div id="container">
	 <h1>영화 제목 : ${movie.movie_title}</h1>
	  <hr>
	  
	<div id="article">
	<table>
                <tr>
                    <th width="70" >개요</th>
                    <td>${movie.movie_gen}</td>
                </tr>

                <tr>
                    <th width="70">감독</th>
                    <td>${movie.director}</td>
                </tr>

                <tr>
                    <th width="70">출연</th>
                    <td>${movie.actor}</td>
                </tr>
            </table>


            <div id ="poster" align="right">
                <img src="resources/images/${movie.filename}" alt="${movie.movie_title}">
         	</div>
	<hr>
	
	<div id ="content">
	<table>
            <tr>
                <th width="70">줄거리</th>
                <td>${movie.movie_content}</td>
            </tr>
        </table>

        <hr>

        <table>
            <tr>
                <th width="70">주연배우</th>
                <td>${movie.actor}</td>
            </tr>
        </table>
        
        <hr>

        <table>
            <tr>
                <th width="70">리뷰</th>
                <td>${rev.rev_content}</td>
            </tr>

        </table>
	
	
	</div>

</div>

</div>

		<a href="updateMovie.jsp">글 수정</a>&nbsp;&nbsp;
        <a href="deleteMovie.do?movie_seq=${movie.movie_seq}">글삭제</a>&nbsp;&nbsp;
        <a href="getMovieList.do">글 목록</a>

</form>

</body>
</html>