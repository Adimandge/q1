package Exceptionhandlingprograms;
//design pattern    
// MVC 
//ORM
//singleton design pattern  ->>  when we want class to have maximum one object  
//how to make singleton class

//1) make constructor as private
//2 make static class variable 
//3 create static method that return class object
class PathSet
{static  String url="www.gmail.com";
    static PathSet r= new PathSet();
    
	private PathSet(){}
	
	//factory method 
	static PathSet getPathAddress()
	{
		return r;
	}
}
public class SingletonExample2 
{
	public static void main(String[] args) 
	{
		
		
 		

	}

}
