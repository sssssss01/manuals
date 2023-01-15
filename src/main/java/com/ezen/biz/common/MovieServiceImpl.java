package com.ezen.biz.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dto.MovieDAO;
import com.ezen.biz.vo.MovieVO;

@Service("movieService")
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDAO mdao;
	
	public MovieServiceImpl() {}
	
	@Override
	public void insertMovie(MovieVO vo) {
		mdao.insertMovie(vo);

	}

	@Override
	public void updateMovie(MovieVO vo) {
		mdao.updateMovie(vo);
		
	}

	@Override
	public void deleteMovie(MovieVO vo) {

		mdao.deleteMovie(vo);
	}

	@Override
	public MovieVO getMovie(MovieVO vo) {
		
		return mdao.getMovie(vo);
	}

	@Override
	public List<MovieVO> getMovieList(MovieVO vo) {
		
		return mdao.getMovieList(vo);
	}

}
