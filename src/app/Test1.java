package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {
	
	@Test
	public void testaddlist() {
		//Setup
		TodoListEngine T = new TodoListEngine();
		
		//exercise
		T.AddItem("Hello World");	

		//verify
		String result = T.GetItem(0);
		
		String expected = "Hello World";
		assertEquals("Wrong!!!", expected, result);
	}
	
	@Test
	public void testemptylist() {
		//Setup
		TodoListEngine T = new TodoListEngine();
		
		//exercise
		
		//verify
		int result = T.GetTotalItem();
		
		int expected = 0;
		assertEquals("Wrong!!!", expected, result);
	}
	
	@Test
	public void testremovelist() {
		//Setup
		TodoListEngine T = new TodoListEngine();
		
		//exercise
		T.AddItem("11111");	
		T.AddItem("22222");	
		T.RemoveItem(1);

		//verify
		int result = T.GetTotalItem();
		
		int expected = 1;
		assertEquals("Wrong!!!", expected, result);
	}
	
	@Test
	public void testShowList()
	{
		//Setup
		TodoListEngine T = new TodoListEngine();
		
		//exercise
		T.AddItem("          Eat Japanese Sushi");	
		T.AddItem("I         Eat Japanese Sushi");	
		T.AddItem("I want to Eat Japanese Sushi");	
		
		int result = T.ShowList();
		
		//verify
		assertEquals("Showing list failed!", 1, result);
	}
	
	@Test
	public void testStore()
	{
		//Setup
		TodoListEngine T = new TodoListEngine();
		
		//exercise
		T.AddItem("          Eat Japanese Sushi");	
		T.AddItem("I         Eat Japanese Sushi");	
		T.AddItem("I want to Eat Japanese Sushi");	
		
		int result = T.StoreInFile();
		
		//verify
		assertEquals("Showing list failed!", 1, result);
	}
}
