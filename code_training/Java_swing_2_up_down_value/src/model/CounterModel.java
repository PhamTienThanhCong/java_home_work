package model;

public class CounterModel {
	private int counter;

	public CounterModel() {
		this.counter = 0;
	}

	public int getCounter() {
		return this.counter;
	}

	public void AddCounter() {
		this.counter++;
	}
	
	public void SubCounter() {
		this.counter--;
	}
	
}
