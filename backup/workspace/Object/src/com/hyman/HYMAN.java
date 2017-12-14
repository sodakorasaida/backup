package com.hyman;

//パッケージの名前
public class HYMAN {

	public static String say;
	public static String mei;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

System.out.println("HelloWorld");

say="imaizumi";
mei="masashi";

System.out.println(say + mei );

say="aaaaaa";
mei="sssssss";
System.out.println(say + mei);

	HYMANName hymanName=new HYMANName();

	System.out.println(hymanName.getName());

	String say1=hymanName.say;

	String mei=hymanName.getmei();

	System.out.println(mei);

	HYMANName hymanName2=new HYMANName("田中","太郎");

	System.out.println(hymanName2.getName());



	}

}
