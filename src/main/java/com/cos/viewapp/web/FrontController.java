package com.cos.viewapp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// RestController ( data를 return한다 )
// Controller	  ( file을 return한다 )


@Controller
public class FrontController {
	
	//http://localhost:8080/home
	//Dispatcher-Servlet /home parsing
	//IoC container 에 @RestController, @Controller로 생성된 객체만 찾는다
	//Method를 호출
	@GetMapping("/home")
	public String home(Model model) { // request == model
		// ViewResolver 클래스
		// src/main/resources/templates (prefix)
		// .mustache (suffix)
		
		String name = "강창래";
		model.addAttribute("name", name);
		
		 List<Board> boards = new ArrayList<>();
		 boards.add( new Board(1,"제목1"));
		 boards.add( new Board(2,"제목2"));
		 model.addAttribute("boards",boards);
		 
		 
		 
		return "home"; //RequsetDispatcher가 자동 작동
	}
}
