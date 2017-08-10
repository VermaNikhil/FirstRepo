package Facebook;

interface IQuak{
	public void quak();
}

interface IFly{
	public void fly();
}

class NoQuak implements IQuak{
	
	public void quak() {
		System.out.println("Duck can't quak");
	}
}

class BabyQuak implements IQuak{
	
	public void quak() {
		System.out.println("tuak tuak....");
	}
}

class AdultQuak implements IQuak{
	
	public void quak() {
		System.out.println("Quak Quak....");
	}
}

class NoFly implements IFly{
	
	public void fly() {
		System.out.println("Duck can't fly");
	}
}

class BabyFly implements IFly{
	
	public void fly() {
		System.out.println("Slowly fly");
	}
}

class AdultFly implements IFly{
	
	public void fly() {
		System.out.println("flying....");
	}
}

class Duck {
	
	IQuak IQ;
	IFly IF;
	
	public Duck(IQuak IQ, IFly IF){
		this.IQ = IQ;
		this.IF = IF;
	}
	
	public void fly() {
		this.IF.fly();
	}
	
	public void quak() {
		this.IQ.quak();
	}
}

public class DesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck rd = new Duck(new NoQuak(), new NoFly());
		rd.fly();
		rd.quak();
		Duck babyDuck = new Duck(new BabyQuak(), new BabyFly());
		babyDuck.fly();
		babyDuck.quak();
		Duck AdultDuck = new Duck(new AdultQuak(), new AdultFly());
		AdultDuck.fly();
		AdultDuck.quak();
	}

}
