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
	  public String blockM(){
		  return
				  "M       M\n"+
				  "M M   M M\n"+
				  "M  M M  M\n"+
				  "M   M   M\n"+
				  "M       M\n";
	  }
	  public String blockN(){
		  return  "N    N\n"+
				      "NN   N\n"+
				      "N N  N\n"+
				      "N  N N\n"+
				      "N   NN\n";
				  
	  }
	  public String blockO(){
		  return
				  " OOO\n"+
				  "O   O\n"+
				  "O   O\n"+
				  "O   O\n"+
				  " OOO\n";
	  }
	  public String Y()
	  {
	    return "  Y    Y   \n"+
	           "   Y  Y    \n"+
	           "    Y      \n"+
	           "    Y      \n"+
	           "    Y      \n";
	  } 
	  public String Z()
	  {
	    return "  ZZZZZ \n"+
	           "     Z  \n"+
	           "    Z   \n"+
	           "   Z    \n"+
	           "  ZZZZZ \n";
	  } 
}
