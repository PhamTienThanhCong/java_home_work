package model;

public class ValueModel {
	private String number1;
	private String number2;
	private String PhepTinh;
	public ValueModel() {
		super();
		this.number1 = "0";
		this.number2 = "0";
		this.PhepTinh = "=";
	}
	public String getNumber1() {
		return number1;
	}
	public void setNumber1(String number1) {
		this.number1 = number1;
	}
	public String getNumber2() {
		return number2;
	}
	public void setNumber2(String number2) {
		this.number2 = number2;
	}
	public String getPhepTinh() {
		return PhepTinh;
	}
	public void setPhepTinh(String phepTinh) {
		this.PhepTinh = phepTinh;
	}
	public void add(String a) {
		if(this.number1 == "0") {
			if (a == ".") {
				this.number1 += a;
			}else {
				this.number1 = a;
			}
		}else {
			this.number1 += a;
		}
	}
	
	public void function(String PhepTinh) {
		if (this.number1 != "0") {
			this.number1 = calculate();
		}
		this.PhepTinh = PhepTinh;
		if (this.number1 == "0") {
			this.number1 = "0";
		}else {
			this.number2 = this.number1;
			this.number1 = "0";
		}
	}
	
	public void ResetDel() {
		this.number1 = "0";
		this.number2 = "0";
		this.PhepTinh = "=";
	}
	
	public String calculate() {
		
		Double value1 = Double.parseDouble(this.number1);
		Double value2 = Double.parseDouble(this.number2);
		String val = this.number1;
		
		if (this.PhepTinh == "+") {
			val = (value2 + value1)+"";
		}else if (this.PhepTinh == "-") {
			val = (value2 - value1)+"";
		}else if (this.PhepTinh == "x") {
			val = (value2 * value1)+"";
		}else if (this.PhepTinh == "/") {
			val = (value2 / value1)+"";
		}
		this.PhepTinh = "=";
		this.number1 = val;
		return val;
		
	}
	
	
}
