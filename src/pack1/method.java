package pack1;

public class method
{ 
	 
	int r = 4;
	public static void main(String [] ar)
	{
		System.out.println("find out area and circumference of circle");
		area();
		circ();
		
		
	}
    
	public static void area()
	{
		System.out.println("method call from \ndifferent class ARea of circle is:==>"+3.14*4*4);
	}

 //class New1
//{

public static void circ()
    {
	System.out.println("Circumference of circle is:==>"+ 2*3.14*4);
    }
}
