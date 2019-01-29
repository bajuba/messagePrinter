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
    BlockMessage myMessage = new BlockMessage("first","Y");
    BlockMessage myMessage2 = new BlockMessage("first","Z");
    System.out.println(myMessage.exclamation());
    System.out.println(myMessage.period());
    System.out.println(myMessage.question());


    System.out.println(myMessage.D());
    System.out.println(myMessage.E());
    System.out.println(myMessage.F());
}

    System.out.println(myMessage.pLetter());
    System.out.println(myMessage.qLetter());
    System.out.println(myMessage.rLetter());

    System.out.println(myMessage.y());
    System.out.println(myMessage2.z());
	 }
    System.out.println(myMessage.vendeta());
	System.out.println(myMessage.whyMe());
	System.out.println(myMessage.xylophone());
  }
}