package javaExceptionHandling;

public class UncheckedExceptionEx1HandleExc {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.length());
			int result = 10/0;
			System.out.println("result: " + result);
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e);
			e.printStackTrace();
		}
		
	}
}
