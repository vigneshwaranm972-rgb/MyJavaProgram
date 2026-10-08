package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialDemo implements Serializable
{
  int eno;
   String ename;
 float esal; 
  public SerialDemo(int eno, String ename, float esal) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.esal = esal;
}
  
	
	
	

}
public class Employee{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SerialDemo S=new SerialDemo(1,"vicky",458.3f);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e:/web.txt"));
		oos.writeObject(S);
		System.out.println("data written");
		
	}
}


