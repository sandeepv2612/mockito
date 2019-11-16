package com.lrn.mockito.business;

import java.util.List;
import java.util.stream.Collectors;

import com.lrn.mockito.TodoService;

public class TodoBusinessImpl {

	TodoService toservice;

	public TodoBusinessImpl(TodoService toservice) {
		super();
		this.toservice = toservice;
	}
	
	public List<String> retrieveTodosBusinessUnit(String user){
		
		List<String> retrieveTodods = toservice.retrieveTodods(user);
		return  retrieveTodods.stream().filter(s-> s.contains(user)).collect(Collectors.toList());
	}
	
}
