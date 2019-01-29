package block1;
//nt out block letters.
//lets use a class f
//create code to prior the message
//a message contains
//name
//text
//allow a message to be printed normally, and with block letter
//write a method for each letter
class BlockMessage {
	private String name;
	private String message;
	
	
	public BlockMessage(String name, String message) {
	  this.name = name;
	  this.message = message;
	}
	public String exclamation()
	{
	  return "  !  \n"+
	         "  !  \n"+
	         "  !  \n"+
	         "     \n"+
	         "  !  \n";
	}
	public String period()
	{
	  return "     \n"+
	         "     \n"+
	         "     \n"+
	         " ... \n"+
	         " ... \n";
	}
	public String question()
	{
	  return "  ?? \n"+
	         " ?  ?\n"+
	         "   ? \n"+
	         "     \n"+
	         "   ? \n";
	}
}
public String blockJ(){
    return
        "JJJJJ\n"+
        "   J  \n"+
        "   J \n"+
        "J  J \n"+
        "JJJJ \n";
  }
  public String blockK(){
    return
      "K   K\n"+ 
      "K KK \n"+
      "KK   \n"+
      "K KK \n"+
      "K   K\n";
  }
  public String blockL(){
    return
      "L    \n"+
      "L    \n"+
      "L    \n"+
      "L    \n"+
      "LLLLL\n";
  }
}
