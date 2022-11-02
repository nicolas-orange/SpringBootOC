package fr.imt.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
	
	@Autowired
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
	/**
	public BusinessService getbs = new HelloWorld() {
	this.getbs=getHelloWorld();
	}
	public BusinessService() {
		public HelloWorld getHelloWorld() {
			return getHelloWorld();
		}
	}
	**/
}
