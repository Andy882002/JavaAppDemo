package com.obj;
import com.app.MyApp;
public class AppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		MyApp app=new MyApp("Jeff Simth","IU87900");
		System.out.println("The Obje of Person:"+app.toString());
		System.out.println("This is change: "+app.getId()+ "  "+app.getName());

	}

}
