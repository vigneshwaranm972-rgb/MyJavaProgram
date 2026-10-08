package practice;
class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Thread called"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
	}
}
}
public class InterfaceDemo


{

	public static void main(String[] args) throws Exception{
		MyThread my1=new MyThread();
		Thread m1=new Thread(my1);
		MyThread my2=new MyThread();
		Thread m2=new Thread(my2);
		m1.setName("vicky");
		m2.setName("vijay");
		m1.start();
		System.out.println(m1.getName()+"alive:" +m1.isAlive());
		System.out.println(m2.getName()+"alive:" +m2.isAlive());
		m1.join();
		m2.start();
		System.out.println(m1.getName()+"alive:" +m1.isAlive());
		System.out.println(m2.getName()+"alive:" +m2.isAlive());
		
}

}

