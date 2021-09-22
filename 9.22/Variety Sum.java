public class Ex_09 {
	
	
	public static int Sum() {
		int result = 0;
		for (int i = 1; i <=10; i++) 
		{
			result += i;
		}
		return(result);
	}
  
	public static int Sum(int n1,int n2) {
		int result = 0;
		for (int i = n1; i <= n2; i++)
		{
			result += i;
			
		}
		return result;
	}
	
	public static double Sum(double n1, double n2) {
		double result = 0;
		for (double i = n1; i <= n2; i++) {
			result += i;
		}
		return result;
	}
	
	public static double Sum(double n1, int n2){
		double result = 0;
		for (double i = n1; i <= n2; i += 0.5) 
		{
			result += i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Sum());
		int n1 = 10, n2 = 100;
		double nd1 = 5.5, nd2 = 10.5;
		System.out.println(Sum(n1, n2));
		System.out.println(Sum(nd1, nd2));
		System.out.println(Sum(nd1, n1));
	}
}

