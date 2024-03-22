package com.myprojects.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.myprojects.model.MyList;
import com.myprojects.service.MyListService;

@Controller
@SessionAttributes("name")
public class MyListController {
	
	@Autowired
	public MyListService myListService;
	
	@RequestMapping("/mylist")
	public String myListOfDetails(ModelMap model) {
		List<MyList> todos=myListService.findByUsername("mohan");
		model.addAttribute("todos", todos);
		return "mylist";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String addNewTodo(@RequestParam String description,ModelMap model) {
		String username=(String)model.get("name");
		myListService.addTodo(username, description, LocalDate.now().plusYears(1), false);
		return "redirect:mylist";
	}

}
