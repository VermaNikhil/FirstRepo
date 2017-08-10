package Facebook;
//import java.lang.*;


public class StartApplication{
	public static void main(String[] args) {
		Runnable mythread = new MyRunnable();
		Thread t1 = new Thread(mythread);
		Thread t2 = new Thread(mythread);

		t1.start();
		t2.start();
		
	}
}

class MyRunnable implements Runnable{
	
	String txt;
	public void  run() {
		String[] s = {"Abhishek", "is", "such","a", "ch**ya", "person"};
		for (String s1 : s) {
			synchronized(this) {
				System.out.println(Thread.currentThread().getName()+" " + s1);
				
				try {
					//wait(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}


