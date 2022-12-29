package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n= 6;
     boolean prime=false;
     for(int i=2;i<=n/2;i++) {
    	 if(n%i==0) {
    		 prime=true;
    		 break;
    		 }
     }
     if(prime==true) {
    	System.out.println(n+"is not a prime number");
    	
     }
     else {
    	 System.out.println(n+"is a prime number");
    	 }
     }
}
