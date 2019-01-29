package block1;

import blocks.BlockMessage;

//create code to print out block letters.
//lets use a class for the message
//a message contains
//name
//text
//allow a message to be printed normally, and with block letter
//write a method for each letter
public class Main {
  public static void main(String[] args) {
    BlockMessage myMessage = new BlockMessage("first","!");
    BlockMessage MyMessage = new BlockMessage("first","Y");
    BlockMessage myMessage2 = new BlockMessage("first","Z");
    

    System.out.println(myMessage.a());
    System.out.println(myMessage.b());
    System.out.println(myMessage.c());
    System.out.println(myMessage.d());
    System.out.println(myMessage.e());
    System.out.println(myMessage.f());
    System.out.println(myMessage.g());
    System.out.println(myMessage.h());
    System.out.println(myMessage.i());
    System.out.println(myMessage.j());
    System.out.println(myMessage.k());
    System.out.println(myMessage.l());
    System.out.println(myMessage.m());
	System.out.println(myMessage.n());
	System.out.println(myMessage.o());
    System.out.println(myMessage.p());
    System.out.println(myMessage.q());
    System.out.println(myMessage.r());
    System.out.println(myMessage.s());
    System.out.println(myMessage.t());
    System.out.println(myMessage.u());
    System.out.println(myMessage.v());
    System.out.println(myMessage.w());
    System.out.println(myMessage.x());
    System.out.println(myMessage.y());
    System.out.println(myMessage.z());
	
	System.out.println(myMessage.exclamation());
    System.out.println(myMessage.period());
    System.out.println(myMessage.question());
    
}

}