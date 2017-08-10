package Facebook;

import java.util.*;

interface IObservable{
	public void add(IObserver o);
	public void remove(IObserver o);
	public void Notify();
}

interface IObserver{
	public void Update();
}

class WeatherStation implements IObservable{
	
	private LinkedList<IObserver> observers = new LinkedList<>();
	private int CurrentTemp = 50;
	boolean wind;
	public void add(IObserver o) {
		this.observers.add(o);
	}
	public void remove(IObserver o){
		this.observers.remove(this.observers.indexOf(o));
	}
	public void Notify() {
		for(IObserver o : observers) {
			System.out.print(o.getClass().getName() + ": ");
			o.Update();
		}
	}
	public int Temperature() {
		return this.CurrentTemp;
	}
	
	public boolean wind() {
		return this.wind;
	}
}

class DisplayPhone implements IObserver{
	
	private WeatherStation ws;
	DisplayPhone(WeatherStation ws){
		this.ws = ws;
	}
	public void Update() {
		System.out.println(ws.Temperature() + "*C");
	}
}

public class ObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayPhone dp1 = new DisplayPhone(new WeatherStation());
		DisplayPhone dp2 = new DisplayPhone(new WeatherStation());
		DisplayPhone dp3 = new DisplayPhone(new WeatherStation());
		WeatherStation ws1 = new WeatherStation();
		ws1.add(dp1);
		ws1.add(dp2);
		ws1.add(dp3);
		ws1.remove(dp2);
		ws1.Notify();
	}

}
