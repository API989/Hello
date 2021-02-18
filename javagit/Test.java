package Assign;

public class Test {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println("first line");
		int arr[]=new int[2];
		int a=2;
		int b=4;
		int c;
		arr[0]=1;
		arr[1]=2;
		System.out.println(arr);
		try
		{
			c=a/b;
			arr[5]=6;
			System.out.println("Hello");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled"+ e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is handled"+ e);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled"+ e);
		}
		finally
		{
			System.out.println("Finally is executed");
		}
		System.out.println("After finally");

	}

}

