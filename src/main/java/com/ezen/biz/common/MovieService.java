package com.ezen.biz.common;

import java.util.List;

import com.ezen.biz.vo.MovieVO;

public interface MovieService {

	void insertMovie(MovieVO vo);

	void updateMovie(MovieVO vo);

	void deleteMovie(MovieVO vo);

	MovieVO getMovie(MovieVO vo);

	List<MovieVO> getMovieList(MovieVO vo);

}