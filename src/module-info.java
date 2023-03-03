import exceptionDemo.Parent;
import exceptionDemo.Test;

/**
 * 
 */
/**
 * @author LAKSHMAN
 *
 */
module exceptionDemo {
}

////	System.out.println(x);
//String emailId="john#global.com";
//
//System.out.println(emailId.indexOf('@'));
//
//String  name="Sudha learns Oracle";
//
//System.out.println(name.substring(7,12));
//}
//
//}

//import java.util.regex.*;  
//
//public class Demo{  
//
//public static void main(String args[])  {  
//
//   Pattern p = Pattern.compile(".ech");
//   Matcher m = p.matcher("tech");  
//   boolean b = m.matches();  
//   System.out.println(b);
//}
//
//}


//abstract class Sample {
//
//public int x;
//
//Sample()      {
//
//x = 10;
//
//}
//
//abstract final public void display(); 
//
//}
//
//
//
//class Test extends Sample { 
//
//final public void display()   {
//
//System.out.println("x = " + x);
//
//}
//
//public static void main(String[] args)   {
//
//Test t = new Test();
//
//t.display();        
//
//}
//
//}


class Parent  {

public void display()     {

System.out.println("In Parent");

}

}

class Test extends Parent  { 

public void display()  {

System.out.println("In child");

} 

public void testMethod()  {

System.out.println("In test method");

} 

public static void main(String[] args)  {

Parent p = new Test();

p.display();        

p.testMethod();

}

}