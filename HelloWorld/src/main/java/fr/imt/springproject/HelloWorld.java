package fr.imt.springproject;

public class HelloWorld {
	private String value="Hello World !";
	public HelloWorld() {}

	
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "HelloWorld [value=" + value + "]";
	}

	public void printHelloWorld() {
		System.out.println(value);
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
