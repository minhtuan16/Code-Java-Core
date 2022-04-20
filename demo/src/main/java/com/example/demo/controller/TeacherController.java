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

import com.example.demo.entity_model.Teacher;
import com.example.demo.repository.TeacherRepo;

@Controller

@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherRepo teacherRepo;

	@GetMapping("/create")
	public String create() {

		return "teacher/create";
	}

	/*
	 * @GetMapping("/search") public String search() { return "student/search"; }
	 */

	@PostMapping("/create")
	public String create(HttpServletRequest req, Model model) {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		teacherRepo.save(new com.example.demo.entity_model.Teacher(Integer.parseInt(id), name));
//		req.setAttribute("msg", "them thanh cong");

		return "teacher/create";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest req, @RequestParam("id") int id) {
		teacherRepo.deleteById(id);
		req.setAttribute("msg", "xoa thanh cong");
		return "redirect:/teacher/search"; // search ten file

	}

	@GetMapping("/search")
	public String search(Model model) {
		List<Teacher> list = teacherRepo.findAll();
		model.addAttribute("list", list);
		return "teacher/search";
	}

}
