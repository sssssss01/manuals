package com.ezen.biz.dto;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.vo.MovieVO;

@Repository("movieDAO")
public class MovieDAO {
	
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertMovie(MovieVO vo) {
		System.out.println("==insertMovie");
		mybatis.insert("movieMapper.insertMovie",vo);
		
	}
	
	
	public void updateMovie(MovieVO vo) {
		System.out.println("==updateMovie");
		mybatis.update("movieMapper.updateMovie",vo);
	}
	
	
	public void deleteMovie(MovieVO vo) {
		System.out.println("==deleteMovie");
		mybatis.delete("movieMapper.deleteMovie",vo);
	}
	
	
	public MovieVO getMovie(MovieVO vo) {
		System.out.println("==getMovie");
		return mybatis.selectOne("movieMapper.getMovie", vo);
	}
	
	
	public List<MovieVO> getMovieList(MovieVO vo){
		System.out.println("==getMovieList");
		return mybatis.selectList("movieMapper.getMovieList", vo);
	}
}
