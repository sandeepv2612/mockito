package com.lrn.mockito.tightcoupled;

import java.util.Arrays;
import java.util.List;

import com.lrn.mockito.TodoService;


public class TodoServiceTest implements TodoService {


	@Override
	public List<String> retrieveTodods(String user) {
		return Arrays.asList("java","spring","hibernate","struts","angular2","springboot");
	}

}
