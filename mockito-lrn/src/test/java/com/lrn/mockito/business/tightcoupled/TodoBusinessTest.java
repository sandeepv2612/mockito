package com.lrn.mockito.business.tightcoupled;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import com.lrn.mockito.TodoService;
import com.lrn.mockito.business.TodoBusinessImpl;
import com.lrn.mockito.tightcoupled.TodoServiceTest;

public class TodoBusinessTest {

	

	@Test
	public void test() {
	
	TodoService toservice =new TodoServiceTest();
	TodoBusinessImpl impl = new TodoBusinessImpl(toservice);
	List<String> retrieveTodosBusinessUnit = impl.retrieveTodosBusinessUnit("spring");
	assertEquals(2, retrieveTodosBusinessUnit.size());
	}
	
	@Test
	public void testforConditionFails() {
	
	TodoService toservice =new TodoServiceTest();
	TodoBusinessImpl impl = new TodoBusinessImpl(toservice);
	List<String> retrieveTodosBusinessUnit = impl.retrieveTodosBusinessUnit("junit");
	assertEquals(0, retrieveTodosBusinessUnit.size());
	}
	

}
