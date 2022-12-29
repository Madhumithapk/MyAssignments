package week1.day2;

public class FindIntersections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {1,4,7,3,9,5};
    int[] b= {1,4,8,4,9,7};
    System.out.println("The intersected value is");
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<b.length;j++) {
    		if(a[i]==b[j]) {
    			System.out.println(""+a[i]);
    			
    		}
    	}
    }
    	
	}

}
