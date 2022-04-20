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

import com.example.demo.entity_model.Student;
import com.example.demo.repository.StudentRepo;

@Controller

@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo studentRepo;

	@GetMapping("/create")
	public String create() {

		return "student/create";
	}

	/*
	 * @GetMapping("/search") public String search() { return "student/search"; }
	 */

	@PostMapping("/create")
	public String create(HttpServletRequest req, Model model) {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		studentRepo.save(new com.example.demo.entity_model.Student(Integer.parseInt(id), name));
//		req.setAttribute("msg", "them thanh cong");

		return "student/create";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest req, @RequestParam("id") int id) {
		studentRepo.deleteById(id);
		req.setAttribute("msg", "xoa thanh cong");
		return "redirect:/student/search"; // search ten file

	}

	@GetMapping("/search")
	public String search(Model model) {
		List<Student> list = studentRepo.findAll();
		model.addAttribute("studentList", list);
		return "student/search";
	}

}