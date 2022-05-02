package Aditya;

class t1 extends Exception {
	t1()
	{ System.out.println("check method");
	
}}
class t2 extends RuntimeException{
	t2 (){
		System.out.println("unchecked method");
	}
}
public class exception {

	public static void main(String[] args) {
		int age=10;
	
        try {
        	
        	if (age==10) throw new	t1();
        	else         throw new  t2();
        	
        } 
        catch(Exception a) {
        	System.out.println("exception in catch");
        }
	}

}
