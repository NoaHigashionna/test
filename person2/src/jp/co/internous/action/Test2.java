package jp.co.internous.action;

public class  Test2{

	public static void main(String[] args) {

		Person2 taro = new Person2();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person2 jiro = new Person2("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		System.out.println("----------------------");

		Person2 saburo = new Person2("saburo",0);
		System.out.println(saburo.name+","+saburo.age);

		Person2 nanashi = new Person2(25);
		System.out.println(nanashi.name+","+nanashi.age);

		Person2 hanako = new Person2("hananko", 17);
		System.out.println(hanako.name+","+hanako.age);
	}

}
