package app;

public class TodoListApp {
	TodoListEngine _mainEngine;
	
    @SuppressWarnings("unused")
	public static void main ( String [] arguments )
    {
    	TodoListEngine _mainEngine = new TodoListEngine();
    	
    	_mainEngine.AddItem("TDD Everything");
    	_mainEngine.AddItem("Code Everything");
    	_mainEngine.AddItem("Run Everything");
    	_mainEngine.AddItem("Fail Everything");
    	
    	_mainEngine.ShowList();
    }
}
