import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
 public String str;
    private static Singleton instance = null;
    private Singleton() {
    }
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class singletonpattern {
    public static void main(String args[])throws Exception{
	
	Scanner sc=new Scanner(System.in);
	Singleton s1 = Singleton.getSingleInstance(); 
    Singleton s2=Singleton.getSingleInstance();
    assert(s1==s2);
	
	Class c=s1.getClass();
	Constructor[] allConstructors = c.getDeclaredConstructors();
	assert allConstructors.length==1;
	for (Constructor ctor : allConstructors) 
	{
		if(ctor.getModifiers()!=2 || !ctor.toString().equals("private Singleton()")) 
		{
			System.out.println("Wrong class!");
		}
	}
    String str=sc.nextLine();
	s1.str=str;
    s2.str=str;
    System.out.println("Hello I am a singleton! Let me say "+str+" to you");
	
 }
}
