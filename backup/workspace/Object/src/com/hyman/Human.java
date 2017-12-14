package com.hyman;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Human extends Applet
implements Runnable, ActionListener {
private static final int EXTERNAL_BUFFER_SIZE = 128000;

Image image[] = new Image[3];
Thread t;
int index1 = 0;
int index2 = 0;
String msg = "";
String msg1 = "";

boolean state = false;
Button b1 = new Button("ぐー");
Button b2 = new Button("ちょき");
Button b3 = new Button("ぱー");

public void init(){
for(int i = 0; i<=2; i++){
image[i] = getImage(getDocumentBase(),"hanabi" + (i+1) + ".JPG");
}
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
msg1 = "結果は・・";

}

public void paint(Graphics g){
g.drawImage(image[index1],350,30,this);
g.drawImage(image[index2],695,30,this);
g.drawString("コンピューター",420,300);
g.drawString("あなた",800,300);
g.drawString(msg,630,320);
g.drawString(msg1,550,320);
}

public void start(){
state = true;
t = new Thread(this);
t.start();

}

public void run(){
while(state){
index1++;
if(index1 == 3){
index1 = 0;
}
index2++;
if(index2 == 3){
index2 = 0;
}
repaint();
try {
Thread.sleep(60);
}catch(InterruptedException e) { }
}
}

public void actionPerformed(ActionEvent e){
if(state == false) {
start();
return;

}
state = false;
if(e.getSource() == b1) {
msg = "ぐー";
index2 = 0;
}

else if(e.getSource() == b2){
msg = "ちょき";
index2 = 1;
}

else if(e.getSource() == b3){
msg = "ぱー";
index2 = 2;
}
check();
repaint();
}

public void check() {
if(index1 == index2) msg ="あいこ";


else if (index1 == 0) {
if(index2 == 2) msg="あなたの勝ち";
else msg ="あなたの負け";
}

else if(index1 == 1) {
if(index2 == 0) msg="あなたの勝ち";
else msg="あなたの負け";
}

else if(index1 == 2) {
if(index2 == 1) msg="あなたの勝ち";
else msg="あなたの負け";
}

}
}

