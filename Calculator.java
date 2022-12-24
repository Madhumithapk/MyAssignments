package week1.day1;

public class Calculator {

	public void sub() {
		int a=10;
		int b=30;
		int c=b-a;
		System.out.println(c);

	}
   public int multiply(int a,int b) {
	return a*b;
	
}
   public static void main(String[] args) {
	Calculator obj = new Calculator();
	obj.sub();
	int multiply = obj.multiply(5,9);
	System.out.println(multiply);
	
	
}
}
