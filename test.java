package Facebook;
//import java.lang.*;
import java.io.*;

class Animal implements Serializable{
	public void im() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {
	private int size;
	String name;
	
	public void run(){
		System.out.println("Dog is running");
	}
	
	public void setSize(int s) {
		if(s>0) {
			size = s;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public void im() {
		System.out.println("Dog");
	}
}

class Cat extends Animal{
	
	public void im() {
		System.out.println("Cat");
	}
}
	
public  class test implements Serializable{
	//private Animal animal = new Animal();
	public static void main(String[] args){
		Animal a = new Dog(); 
		
		/*test to = new test();
		Dog d1 = new Dog();
		d1.name = "Abhishek";
		d1.setSize(10);
		d1.im();
		Dog d2 = new Dog();
		d2.name = "Nishant";
		d2.setSize(20);
		
		try{
		//File f = new File("save.txt");
		FileOutputStream fileStream = new FileOutputStream("save.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fileStream);
		oos.writeObject(to);
		oos.close();
		
		FileInputStream fis = new FileInputStream("save.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Dog d = (Dog)ois.readObject();
		test ti = (test)ois.readObject();
		ti.animal.im();
		/*System.out.println(d.getSize());
		Dog d11 = (Dog)ois.readObject();
		System.out.println(d11.name);*/
		/*ois.close();
		}
		catch(Exception e){/*e.printStackTrace();}*/
	}
}

 