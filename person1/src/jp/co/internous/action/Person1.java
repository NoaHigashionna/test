package jp.co.internous.action;

public class Person1 {
	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;
	public String seibetsu = null;
	public String seinengappi = null;

	public void talk(){
		System.out.println(this.name + "が話す");
	}
	public void walk(){
		System.out.println(this.name + "が歩く");
	}
	public void run(){
		System.out.println(this.name + "が走る");
	}

}
