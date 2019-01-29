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
	public String vendeta() {
		return "VVVVV \n"
				+" \n"
				+ "VVVVV \n"
				+" \n"
				+ "VVVVV \n";
	}
	public String whyMe() {
		return "WWWWW \n"
				+ " \n"
				+ "WWWWW \n"
				+ " \n"
				+ "WWWWW \n";
	}
	public String xylophone() {
		return "XXXXX \n"
				+ " \n"
				+ "XXXXX \n"
				+ " \n"
				+ "XXXXX \n";
	}
	
}
