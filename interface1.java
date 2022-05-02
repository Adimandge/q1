package Aditya;

interface vehicle
{
	int code=1234;
	void show();
	default void get()
	{ System.out.println("default method");
	}
	static void input()
	{ System.out.println("this is static method");
	}


}
public class interface1 implements vehicle  {
       public void show() {};
	public static void main(String[] args) {
          vehicle.input();
          
          
	}

}
