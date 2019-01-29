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
	public String pLetter()
	  {
	    return "   pppppp    \n"+
	           "   ppp   p \n"+
	           "   ppp   p \n"+
	           "   pppppp       \n"+
	           "   ppp   \n";
	  } 
	  public String qLetter()
	  {
		  return "   qqqqqq    \n"+ 
				 " qq      qq  \n"+
				 " qq   qq qq  \n"+
				 " qq    qqq   \n"+
				 "   qqqqq  q  \n";
	  }
	  public String rLetter()
	  {
		  return " rrrrrrrrr   \n"+
				 " rr      rr  \n"+
				 " rr     rrr  \n"+
				 " rrrrrrrr    \n"+
				 " rr     rr    \n"+
				 " rr     rr    \n";
	  }
	}
}
