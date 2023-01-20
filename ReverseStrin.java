package week3.day2;

public class ReverseStrin extends OverLoading{

	
		// TODO Auto-generated method stub
		public void OverLoading(int a,int b) {
			System.out.println(10);	
		}
		public static void main(String[] args) {
			String s="Madhumitha";
			char[] charArray = s.toCharArray();
			for(int i = charArray.length-1;i>=0;i--) {
				System.out.print(charArray[i]);
			}
			ReverseString obj=new ReverseString();
	}

}
