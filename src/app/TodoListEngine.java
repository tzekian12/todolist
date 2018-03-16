package app;
import java.util.ArrayList;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TodoListEngine {
	private ArrayList<String> A;
	
	public TodoListEngine(){
		A = new ArrayList();
	}
	
	public int AddItem(String x){
		A.add(x);
		return 1;
	}
	
	public String GetItem(int item){
		String result = A.get(item);
		return result;
	}

	public int RemoveItem(int item){
		A.remove(item);
		return 1;
	}	
	
	public int GetTotalItem(){
		return A.size();
	}
	
	public int ShowList()
	{
		int result = 0;
		int size = A.size();
		
		if (size > 0)
		{
			for(int i=0; i<A.size(); i++)
			{
				System.out.println(A.get(i));
			}
			result = 1;
		}
		
		//System.in.
		
		return result;
	}

	public int StoreInFile()
	{
		FileWriter writer;
		int result = 0;
		
		try {
			writer = new FileWriter("ToDoList.txt");
			
			int size = A.size();
			
			if (size > 0)
			{
				for(int i=0; i<A.size(); i++)
				{
					writer.write(A.get(i)+"\r\n");
				}
				result = 1;
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int ReadFromFile()
	{
		int result = 0;
		FileReader file = null;
		
		try{
			file = new FileReader("ToDoList.txt");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(file);
	    try {
	        //StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        
	        while (line != null)
	        {
	        	A.add(line);
	        	line = br.readLine();
	        }
	        
	        br.close();
	        
	    }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
