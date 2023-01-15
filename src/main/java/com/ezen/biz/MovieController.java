package com.ezen.biz;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.ezen.biz.common.MovieService;
import com.ezen.biz.vo.MovieVO;

@Controller
@SessionAttributes("movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/insertMovie.do")
	public String insertMovie(MovieVO vo) throws IllegalStateException, IOException {
		
		MultipartFile uploadfile = vo.getUploadfile();
		
		if(!uploadfile.isEmpty()) {
			String filename = uploadfile.getOriginalFilename();
			System.out.println("filename = " + filename);
			
			uploadfile.transferTo(new File("D:\\springspacework\\upload" + filename));
			
		}else {
			System.out.println("image가 없습니다");
			vo.setFilename("resources/images/top-gun.jpg");
		}
		
		movieService.insertMovie(vo);
		System.out.println(vo);
		return "redirect: getMovieList.do";
	}
	
	@RequestMapping("/updateMovie.do")
	public String updateMovie(@ModelAttribute("movie")MovieVO vo) {
		System.out.println("update 내용: " + vo);
		movieService.updateMovie(vo);
		return "getMovieList.do";
	}
	
	@RequestMapping("/deleteMovie.do")
	public String deleteMovie(MovieVO vo) {
		
		movieService.deleteMovie(vo);
		return "getMovieList.do";
	}
	
	@RequestMapping("/getMovie.do")
	public String getMovie(MovieVO vo, Model model) {
		
		MovieVO movie = movieService.getMovie(vo);

		model.addAttribute("movie", movie);
		
		return "getMovie.jsp";
	}
	
	@RequestMapping("/getMovieList.do")
	public String getMovieList(MovieVO vo, Model model){
		
		List<MovieVO> list = movieService.getMovieList(vo);
		model.addAttribute("movieList", list);
		
		return "getMovieList.jsp";
	}
}






















