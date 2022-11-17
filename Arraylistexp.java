import java.util.*;
import java.lang.*;
import java.io.*;
class Arraylistexp
{
	public static void main(String args[])
	{
		List<String> name=new ArrayList();
		name.add("Sailesh");
		name.add("Aviral");
		name.add("Atharv");
		name.add("Ayush");
		name.add("Balwant");
		System.out.println("The Array List is");
		for(String s:name)
		{
			System.out.println(s);		
			
		}	

		System.out.println("Program Ends here.");

	
	}	


}