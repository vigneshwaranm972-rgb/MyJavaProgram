package practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) throws Exception{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:/web.txt"));
		SerialDemo S=(SerialDemo) ois.readObject();
		System.out.println(S.eno);
		System.out.println(S.ename);
		System.out.println(S.esal);
		ois.close();
		
	}

}
