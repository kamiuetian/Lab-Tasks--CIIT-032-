package lab11;

public class RecusrvieDemo {

	static int factorial(int n)
	{
		System.out.print("called as:"+n);
		/*Base Case*/
		if(n<=1)
		{
			return 1;
		}
		/*Recursive Case*/
		/*n!=n x (n-1)!*/
		else
		{
			 int result= n * factorial(n-1);
			 System.out.print("return as:" +n);
			 return result;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=factorial(5);
		System.out.println(result);
	}

}
