package week3.day2;


public class FindCharCount {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String input= "Madhumitha";
     int count=0;
     char[] charArray = input.toCharArray();
     for(int i=0;i< charArray.length;i++) {
    	 if(charArray[i]=='a') {
    		 count++;
    		 
    		 
    	 }
     }
     System.out.println("Number of occur a"+count);
	}

}

