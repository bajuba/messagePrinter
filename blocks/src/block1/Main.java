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
    System.out.println(myMessage.Y());
    System.out.println(myMessage2.Z());
	 }
  }
}