package com.ezen.biz.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class MovieVO {

	private int movie_seq ;
	private String movie_gen; 
	private String movie_title;
	private String movie_content ;
	private String user_id ;
	private MultipartFile uploadfile;
	private int movie_cnt;
	private int movie_totalpoint;
	private int movie_pointcnt;
	private String actor;
	private String director;
	private Date movie_regDate;
	private String filename;
	
	private String searchCondition;
	private String searchKeyword;
	
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	public int getMovie_seq() {
		return movie_seq;
	}
	public void setMovie_seq(int movie_seq) {
		this.movie_seq = movie_seq;
	}
	public String getMovie_gen() {
		return movie_gen;
	}
	public void setMovie_gen(String movie_gen) {
		this.movie_gen = movie_gen;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_content() {
		return movie_content;
	}
	public void setMovie_content(String movie_content) {
		this.movie_content = movie_content;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	public int getMovie_cnt() {
		return movie_cnt;
	}
	public void setMovie_cnt(int movie_cnt) {
		this.movie_cnt = movie_cnt;
	}
	public int getMovie_totalpoint() {
		return movie_totalpoint;
	}
	public void setMovie_totalpoint(int movie_totalpoint) {
		this.movie_totalpoint = movie_totalpoint;
	}
	public int getMovie_pointcnt() {
		return movie_pointcnt;
	}
	public void setMovie_pointcnt(int movie_pointcnt) {
		this.movie_pointcnt = movie_pointcnt;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Date getMovie_regDate() {
		return movie_regDate;
	}
	public void setMovie_regDate(Date movie_regDate) {
		this.movie_regDate = movie_regDate;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	@Override
	public String toString() {
		return "MovieVO [movie_seq=" + movie_seq + ", movie_gen=" + movie_gen + ", movie_title=" + movie_title
				+ ", movie_content=" + movie_content + ", user_id=" + user_id + ", uploadfile=" + uploadfile
				+ ", movie_cnt=" + movie_cnt + ", movie_totalpoint=" + movie_totalpoint + ", movie_pointcnt="
				+ movie_pointcnt + ", actor=" + actor + ", director=" + director + ", movie_regDate=" + movie_regDate
				+ ", filename=" + filename + "]";
	}
	
	
	
}
