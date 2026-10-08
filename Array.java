package practice;
class Emp{
	int eno;
	String ename;
	Double sal;
	boolean iseligible;
	Emp(int eno,String ename,Double sal,boolean iseligible){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.iseligible=iseligible;
	}
}
class Student<V>{
	void dis(V a) {
		System.out.println(a);
	}
	void dis1(V t) {
		Emp k=(Emp) t;
		System.out.println(k.eno);
		System.out.println(k.ename);
		System.out.println(k.sal);
		System.out.println(k.iseligible);
		
	}
	
}
public class Array {
	public static void main(String[]args) {
		Student<String>s1=new Student<String>();
		s1.dis("vicky");
		Student<Integer>s2=new Student<Integer>();
		s2.dis(100);
		Student<Float>s3=new Student<Float>();
		s3.dis(9.5f);
		Emp e=new Emp(1,"vicky",25000.10,true);
		Student<Emp> s4 =new Student<Emp>();
		s4.dis1(e);
		}

}
