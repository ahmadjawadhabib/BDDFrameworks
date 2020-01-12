package javaExceptionHandling;

public class FinallyBlockExample {
public static void main(String[] args) {
    try{
        System.out.println("First statement of try block");
        int num=45/5;
        System.out.println(num);
        
     } catch(ArithmeticException e){
    	 
        System.out.println("ArithmeticException: "+ e);
        e.printStackTrace();
        
     }finally{
    	 
        System.out.println("finally block");
     }
     System.out.println("Out of try-catch-finally block");
  }
}
