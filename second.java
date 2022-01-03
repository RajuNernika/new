import java.lang.*;
import java.util.*;
/*public class second
{
	public static void main(String args[])
	{
		int[] x = new int[6];
		x[0] = 1;
		System.out.println(x[0]);
	}
}
import java.lang.*;
public class second
{
	public static void main(String args[])
	{
		System.out.println("this is main my program");
	}
}
//import java.lang.*;
//import java.util.*;

public class second
{
	public static void main(String[]args)
	{
		float b,h,area;
		System.out.println("enter the values of b and h");
		Scanner s = new Scanner(System.in);
		b = s.nextFloat();
		h=s.nextFloat();
		area  = .5f*b*h;
		System.out.println("AREAR OF THE TRIANGLE IS = "+area);
	}
}
public class second
{
	public static void main(String[]args)
	{
		int a,b,c;
		float s;
		double area;
		System.out.println("enter the value of a ,b and c");
		Scanner se = new Scanner(System.in);
		a = se.nextInt();
		b = se.nextInt();
		c  = se.nextInt();
		s = 0.5f*(a+b+c);
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("AREA OF THE TRIANGLE IS ="+area);
	}
}

public class second
{
	public static void main(String[]args)
	{
		System.out.println("enter the values of a ,b and c");
		int a,b,c;
		double r1,r2;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		r1 = (-b+Math.sqrt(b*b- 4*a*c))/(2*a);
		r2= (-b-Math.sqrt(b*b- 4*a*c))/(2*a);
		System.out.println("roorts for given equation is"+r1+" "+r2);
	}
}
public class second
{
	public static void main(String[] args)
	{
		int a = 16,b=10;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a+" "+b);
		
		int c = (byte)(9<<4);
		c= (byte) (c | 12);
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
		
	}
}
class second
{
	public static void main(String[] args)
	{
		sum();
		sum(10,20);
	    sum(10,20,30);
		System.out.println(args.length);
	}
	public static void sum(int...a)
	{
		int total = 0;
		for(int x1:a)
		{
			total = total+x1;
		}
		System.out.println("THE TOTAL SUM IS:"+total);
	}
}

class second
{
	public static void main(String[] args)
	{
	int[][][] a ={{{11,22,37},{63,76,36}},{{23,43},{34,34,23}}};
	int[][][] b= {{{11,22,37},{63,76,36}},{{1,4,2},{4,3}}};
	int[][][] d = {{{11,22,37},{63,76,36}},{{1,4,2},{4,3}}};
		sum(a,b,d);
	}
	public static void sum(int[][][]... x)
	{
		
		for( int[][][] x1:x)
		{
			//System.out.println(x1[0]);
			for(int[][] c : x1)
			{
				for (int[] p : c)
				{
					
					for (int q :p)
					{
						System.out.println(q+" ");
					}
					
				}
				
			}

		}
	}
}
class second
{
	static
	{
		System.out.println("static block");
	}
}


// comond line arguments 
 public class second
 {
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER THE VALUE OF N");
		 int n = sc.nextInt();
		 System.out.println("ENTER THE VALUE OF M");
		 int m = sc.nextInt();
		 int[][] x = new int[(n)][(m)];
		 for(int i = 0;i<n;i++)
		 {
			 for(int j = 0;j<m;j++)
			 {	 
			  x[i][j] = sc.nextInt();
			 //System.out.println(x1);
			 }
		 }
		 for(int[] x1:x)
		{
			for(int x2:x1)
			{
				System.out.println("the array contain value are ="+" "+x2);
			}
		 }
		 
	 }
 }
  public class second
  {
	  public static void main(String[] args)
	  {
		  String str = "raju";
		  String str1 = new String("raju");
		  String str2 = "nenrika";
		  int a = str.length();
		  //System.out.println(a);
		  //System.out.println(str1.equalsIgnoreCase(str));
		  //System.out.println(str1 == str);// to check content of the string
		  System.out.println(str1.contains(str2));
		  System.out.println(str.valueOf(2));
	  }
  }
  
  
 package pack1;
import java.lang.*;
import java.util.*;
public class testp
{
	
	public  void m1()
	{
		
		System.out.println("this is the mmeber with out class");
		
		
	}
} 
class test2 extends testp
{
	public static void main(String[] args)
	{
		testp tp = new testp();
		test2 t2 = new test2();
		tp.m1();
		t2.m1();
	}
}
//
package pack2;
import java.lang.*;
import pack1.testp;
public class test1 extends testp
{
	public static void main(String[] args)
	{
		System.out.println("package demo");
		test1 t1 = new test1();
		t1.m1();
		testp tp1 = new testp();
		tp1.m1();
		
	}
}

abstract class second
{
	abstract void m1();
	abstract void m2();
	public static void main(String[] args)
	{
		//B b = new B();
		//b.m1();
	}
	
}
 class B extends second
{
	
	
	
}
class C extends class B
{
	void m2()
	{
		System.out.println("raju enrika");
	}
}
*/
public class second
{
	public static void main(String[] args)
	{
		int  b = 5;
		String str = "";
		while(b>0)
		{
			str = str+b%2;
			b = b/2;
		}
		System.out.println(str);
		
	}
}



 

	

	




		

