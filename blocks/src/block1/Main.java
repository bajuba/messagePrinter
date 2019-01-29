package block1;
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
    System.out.println(myMessage.exclamation());
    System.out.println(myMessage.period());
    System.out.println(myMessage.question());
  }
}