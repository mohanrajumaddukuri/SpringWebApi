package com.myprojects.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myprojects.model.MyList;

@Service
public class MyListService {
	
//	public List<MyList> myLists=new ArrayList<>();
//	{
//		myLists.add(new MyList(1,"Java","Java collections",LocalDate.now().plusWeeks(1),false));
//		myLists.add(new MyList(2,"Spring-boot","Spring boot api",LocalDate.now().plusWeeks(4),false));
//	}

//	public List<MyList> myTodoList(){
//		return myLists;
//	}
	
	private static List<MyList> todos =new ArrayList<>();
	
	public static int todoCount=0;
	
	static {
		todos.add(new MyList(++todoCount,"Java","Java collections",LocalDate.now().plusWeeks(1),false));
		todos.add(new MyList(++todoCount,"Spring-boot","Spring boot api",LocalDate.now().plusWeeks(4),false));
		
	}
	public List<MyList> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username,String description,LocalDate targetDate,boolean done) {
		MyList todo=new MyList(++todoCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
}
