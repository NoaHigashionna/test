package jp.co.internous.action;

public class Main {

	public static void main(String[] args){
		System.out.println("HelloWorld!!");
		double sum = goukei(5);
		System.out.println(sum);
	}
	public static double goukei(int num1){
		double engoukei = num1*num1*3.14;
		return engoukei;
	}
}
