package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity_model.Course;
import com.example.demo.repository.CourseRepo;

@Controller

@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseRepo courseRepo;
	
	@GetMapping("/create")
	public String create() {
		return "course/create";
	}
	
	@PostMapping("/create")
	public String create(HttpServletRequest req, Model model) {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		
		courseRepo.save(new com.example.demo.entity_model.Course(Integer.parseInt(id), name));
		
		return "course/create";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest req, @RequestParam("id") int id) {
		courseRepo.deleteById(id);
		req.setAttribute("msg", "xoa thanh cong !");
		
		return "redirect:/course/search";
	}
	
	@GetMapping("/search")
	public String search(HttpServletRequest req, Model model) {
		List<Course> list = courseRepo.findAll();
		model.addAttribute("list", list);
		return "course/search";
	}
}
