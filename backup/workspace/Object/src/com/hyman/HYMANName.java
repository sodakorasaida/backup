package com.hyman;

public class HYMANName {
public String say;
private String mei;

public HYMANName(){
	say="imaizumi";
    mei="masashi";
}

public HYMANName(String say , String mei){
//	            メソッドの引数 コンストラクタは何個でも作れる
	this.say=say;
	this.mei=mei;
}






















    public String getName(){
//    	ストリングなので後でかえってくる
    	return say + mei;
//    	終わった後に返す


    }

    public String getmei(){
    	return mei;
    }





}
