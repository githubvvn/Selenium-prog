package pack1;

public class Demo_prog  
	{
		int x;
		static String s;
		Demo_prog()
		{
			System.out.println("Data from CONSTRUCTOR::\n");
			
			x=10;
			s = "abc";
		}
		
		public static void main(String ar [])
		{
			System.out.println("PROGRAM TO PRINT VALUES USING CONSTRUCTOR::\n hi");
			Demo_prog p = new Demo_prog();
		    System.out.print("THE VALUE OF x :"+p.x+"String value: "+s);
	 	}

	}