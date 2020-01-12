package javaExceptionHandling;

public class CheckedExceptionEx1 {
	public static void main(String[] args)  {
		//methodA();
		
//		methodB();
// 		int a = 30;
//		
//		int b = a/0;
//		System.out.println(b);
		
		int a [] = {1,2,3,55,23,10};
		
		try {
			for(int i = 0; i <a.length ; i++) {
				System.out.println(a[i]);
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e);
			e.printStackTrace();
		}
	
	}
	
	public static void methodA() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void methodB() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
