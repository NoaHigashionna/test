package jp.co.internous.action;

public class Robot {
	public String name =null;

	public void talk(){
		System.out.println("私の名前は" + this.name + "です。");
	}

	public void walk(){
		System.out.println(this.name+"、歩きます。てくてく･･･");
	}

	public void run(){
		System.out.println(this.name + "、走ります！\n");
	}
}
