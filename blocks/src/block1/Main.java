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
    //BlockMessage myMessage = new BlockMessage("first","Y");
    BlockMessage myMessage2 = new BlockMessage("first","Z");
    System.out.println(myMessage.exclamation());
    System.out.println(myMessage.period());
    System.out.println(myMessage.question());


    System.out.println(myMessage.a());
    //print your letters here
<<<<<<< HEAD
    System.out.println(myMessage.p());
    System.out.println(myMessage.q());
    System.out.println(myMessage.r());

=======
	System.out.println(myMessage.d());
	System.out.println(myMessage.e());
	System.out.println(myMessage.f());
>>>>>>> f0cdad5503c42dbd69c72eaf86e2028edfb0c3d7
    System.out.println(myMessage.vendeta());
	System.out.println(myMessage.whyMe());
	System.out.println(myMessage.xylophone());
  }
}