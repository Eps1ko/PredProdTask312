package com.crudapp.boot.predprodtask312.controller;


import com.crudapp.boot.predprodtask312.service.UserService;
import com.crudapp.boot.predprodtask312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsersController {
	private final UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public String showAll(Model model) {
		List<User> users = userService.getAllUsers();
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}

	@GetMapping("/new")
	public String newUser(@ModelAttribute("newUser") User user) {
		return "newUser";
	}

	@PostMapping("/addUser")
	public String addUser(@ModelAttribute User user) {
		userService.addUser(user);
		return "redirect:/";
	}

	@GetMapping("/update/{id}")
	public String update(Model model, @PathVariable("id") Long id) {
		model.addAttribute("userToUpdate", userService.getUser(id));
		return "updateUser";
	}
	@PostMapping("/updateUser")
	public String updateUser(User user) {
		userService.updateUser(user);
		return "redirect:/";
	}

	@DeleteMapping("/deleteUser/{id}")
	public String delete(@PathVariable("id") Long id) {
		userService.removeUser(id);
		return "redirect:/";
	}
}