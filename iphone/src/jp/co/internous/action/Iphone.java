package jp.co.internous.action;

public class Iphone {

	//20-25ページのプログラム
	public static void main(String[] args) {

		System.out.println("------継承------");
		SmartPhone iphone = new SmartPhone();
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();

		System.out.println("------オーバーライド------");
		SmartPhoneOVR iponeOVR = new SmartPhoneOVR();
		iponeOVR.play();
		iponeOVR.stop();
		iponeOVR.next();
		iponeOVR.back();
		iponeOVR.call();
		iponeOVR.mail();
		iponeOVR.photo();
		iponeOVR.internet();

		System.out.println("------インターフェース------");
		SmartPhoneIF iphoneIF = new SmartPhoneIF();
		iphoneIF.play();
		iphoneIF.stop();
		iphoneIF.next();
		iphoneIF.back();
	}

}
