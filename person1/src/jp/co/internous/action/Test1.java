package jp.co.internous.action;

public class Test1 {

	public static void main(String[] args) {
		Person1 kimura = new Person1();
		Person1 suzuki = new Person1();
		Person1 higashi = new Person1();

		Robot aibo = new Robot();
		Robot asimo = new Robot();
		Robot pepper = new Robot();
		Robot doraemon = new Robot();

		kimura.name = "木村次郎";
		kimura.age = 18;
		kimura.phoneNumber ="070-0000-0000";
		kimura.address = "abc@yh.jp";
		kimura.seibetsu = "男";
		kimura.seinengappi = "1999/12/25";

		suzuki.name = "鈴木花子";
		suzuki.age = 16;
		suzuki.phoneNumber ="070-0000-0000";
		suzuki.address = "abc@yh.jp";
		suzuki.seibetsu = "男";
		suzuki.seinengappi = "1999/12/25";

		higashi.name = "東恩納ノア";
		higashi.age = 20;
		higashi.phoneNumber ="070-0000-0000";
		higashi.address = "abc@yh.jp";
		higashi.seibetsu = "男";
		higashi.seinengappi = "1999/12/25";

		aibo.name ="アイボ";
		asimo.name ="アシモ";
		pepper.name ="ペッパー";
		doraemon.name ="ドラえもん";


		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.phoneNumber);
		System.out.println(kimura.address);
		System.out.println(kimura.seibetsu);
		System.out.println(kimura.seinengappi);
		kimura.talk();
		kimura.walk();
		kimura.run();

		System.out.println();

		System.out.println(suzuki.name);
		System.out.println(suzuki.age);
		System.out.println(suzuki.phoneNumber);
		System.out.println(suzuki.address);
		System.out.println(suzuki.seibetsu);
		System.out.println(suzuki.seinengappi);
		suzuki.talk();
		suzuki.walk();
		suzuki.run();
		System.out.println();

		System.out.println(higashi.name);
		System.out.println(higashi.age);
		System.out.println(higashi.phoneNumber);
		System.out.println(higashi.address);
		System.out.println(higashi.seibetsu);
		System.out.println(higashi.seinengappi);
		higashi.talk();
		higashi.walk();
		higashi.run();

		System.out.println("----------------------------");

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();

		doraemon.talk();
		doraemon.walk();
		doraemon.run();

	}

}
