package Facebook;

abstract class Beverage{
	public abstract int cost();
}

abstract class Addon extends Beverage{
	public abstract int cost();
}

class Espresso extends Beverage{
	public int cost() {
		return 1;
	}
}

class choco extends Addon{
	Beverage bv;
	int i;
	public choco(Beverage bv, int i) {
		this.bv = bv;
		this.i = i;
	}
	
	public int cost() {
		return this.bv.cost() + 2*this.i;
	}
}

class Soya extends Addon{
	Beverage bv;
	int i;
	public Soya(Beverage bv, int i) {
		this.bv = bv;
		this.i = i;
	}
	
	public int cost() {
		return this.bv.cost() + 3*this.i ;
	}
}
public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage es = new Soya(new choco(new Espresso(), 2), 1);
		System.out.println(es.cost());
	}

}
