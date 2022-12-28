package week1.day1;

public class Mobile1 {

	public void makeCall() {
		// TODO Auto-generated method stub
    System.out.println("call 9107838235");
    String mobileModel="vivo";
    float mobileWeight=155.6f;
    System.out.println("mobileModel");
    System.out.println("mobileWeight");
	}
   public void sendMsg() {
	   System.out.println("have you received my call");
	Boolean fullyCharged=true;
	int mobileCost=20000;
	System.out.println("fullyCharged");
	System.out.println("mobileCost");
	
}
   public static void main(String[] args) {
	System.out.println("this is my mobile");
	Mobile1 vivo =new Mobile1();
	vivo.makeCall();
	vivo.sendMsg();
	
}
}

