package dropppdowwn;

import java.sql.DriverManager;

public class ExceptionHandling {

	public static void main(String[] args) {
		Object ref=null;
		try
		{
			ref.toString();
		}
		catch(NullPointerException n)
		{
		System.out.print(ref);	
		}

	}

}
