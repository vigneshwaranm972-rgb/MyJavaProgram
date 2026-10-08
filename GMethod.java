package practice;

public class GMethod {
	<T> void display(T a,T b) {
		System.out.println(a+"  "+b);
	}
	<T>void dis2(T v){
		
        
		System.out.println(((Emp)v).ename);
		System.out.println(((Emp)v).sal);
		System.out.println(((Emp)v).iseligible);
		
	}
public static void main(String[] args) {
	GMethod gm=new GMethod();
	gm.display(1,  "vicky");
	gm.display(2,   "ka");
	Emp e1=new Emp(2,"k",40000.00,false);
	gm.dis2(e1);
		

	}

}
