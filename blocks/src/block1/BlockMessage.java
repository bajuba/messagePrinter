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


	public String exclamation() {
		return "  !  \n" + "  !  \n" + "  !  \n" + "     \n" + "  !  \n";
	}

	public String period() {
		return "     \n" + "     \n" + "     \n" + " ... \n" + " ... \n";
	}

	public String question() {
		return "  ?? \n" + " ?  ?\n" + "   ? \n" + "     \n" + "   ? \n";
	}

	public String a() {
		String ret = "";
		ret += "  A  \n";
		ret += " A A \n";
		ret += "AAAAA\n";
		ret += "A   A\n";
		ret += "A   A\n";
		return ret;
	}

	public String b() {
		String ret = "";
		ret += "bbbb \n";
		ret += "b   b\n";
		ret += "bbbb \n";
		ret += "b   b\n";
		ret += "bbbb \n";
		return ret;
	}

	public String c() {
		String ret = "";
		ret += "  ccc\n";
		ret += " c   \n";
		ret += "c    \n";
		ret += " c   \n";
		ret += "  ccc\n";
		return ret;
	}

	public String d() {
		String ret = "";
		ret += "DD   \n";
		ret += "D D  \n";
		ret += "D  D \n";
		ret += "D D  \n";
		ret += "DD   \n";
		return ret;
	}

	public String e() {
		String ret = "";
		ret += "EEEEE\n";
		ret += "E    \n";
		ret += "EEE  \n";
		ret += "E    \n";
		ret += "EEEEE\n";
		return ret;
	}

	public String f() {
		String ret = "";
		ret += "FFFFF\n";
		ret += "F    \n";
		ret += "FFF  \n";
		ret += "F    \n";
		ret += "F    \n";
		return ret;
	}

	public String g() {
		String ret = "";
		ret += " GGG \n";
		ret += "G    \n";
		ret += "G  GG\n";
		ret += "G   G\n";
		ret += " GGG \n";
		return ret;
	}

	public String h() {
		String ret = "";
		ret += "H   H\n";
		ret += "H   H\n";
		ret += "HHHHH\n";
		ret += "H   H\n";
		ret += "H   H\n";
		return ret;
	}

	public String i() {
		String ret = "";
		ret += "IIIII\n";
		ret += "  I  \n";
		ret += "  I  \n";
		ret += "  I  \n";
		ret += "IIIII\n";
		return ret;
	}

	public String j() {
		String ret = "";
		ret += "JJJJJ\n";
		ret += "  J  \n";
		ret += "  J  \n";
		ret += "J J  \n";
		ret += " J   \n";
		return ret;
	}

	public String k() {
		String ret = "";
		ret += "K   K\n";
		ret += "K  K \n";
		ret += "KKK  \n";
		ret += "K  K \n";
		ret += "K   K\n";
		return ret;
	}

	public String l() {
		String ret = "";
		ret += "L    \n";
		ret += "L    \n";
		ret += "L    \n";
		ret += "L    \n";
		ret += "LLLLL\n";
		return ret;
	}

	public String m() {
		String ret = "";
		ret += "M   M\n";
		ret += "M M M\n";
		ret += "M   M\n";
		ret += "M   M\n";
		ret += "M   M\n";
		return ret;
	}

	public String n() {
		String ret = "";
		ret += "N   N\n";
		ret += "NN  N\n";
		ret += "N N N\n";
		ret += "N  NN\n";
		ret += "N   N\n";
		return ret;
	}

	public String o() {
		String ret = "";
		ret += "  O  \n";
		ret += " O O \n";
		ret += "O   O\n";
		ret += " O O \n";
		ret += "  O  \n";
		return ret;
	}

	public String p() {
		String ret = "";
		ret += "PPPP \n";
		ret += "P   P\n";
		ret += "PPPP \n";
		ret += "P    \n";
		ret += "P    \n";
		return ret;
	}

	public String q() {
		String ret = "";
		ret += " QQQ \n";
		ret += "Q   Q\n";
		ret += "Q   Q\n";
		ret += " QQQ \n";
		ret += "    Q\n";
		return ret;
	}

	public String r() {
		String ret = "";
		ret += "RRRR \n";
		ret += "R   R\n";
		ret += "RRRR \n";
		ret += "R   R\n";
		ret += "R   R\n";
		return ret;
	}

	public String s() {
		String ret = "";
		ret += " SSS \n";
		ret += "S    \n";
		ret += " SSS \n";
		ret += "    S\n";
		ret += " SSS \n";
		return ret;
	}

	public String t() {
		String ret = "";
		ret += "TTTTT\n";
		ret += "  T  \n";
		ret += "  T  \n";
		ret += "  T  \n";
		ret += "  T  \n";
		return ret;
	}

	public String u() {
		String ret = "";
		ret += "U   U\n";
		ret += "U   U\n";
		ret += "U   U\n";
		ret += "U   U\n";
		ret += " UUU \n";
		return ret;
	}

	public String v() {
		String ret = "";
		ret += "V   V\n";
		ret += "V   V\n";
		ret += " V V \n";
		ret += " V V \n";
		ret += "  V  \n";
		return ret;
	}

	public String w() {
		String ret = "";
		ret += "W W W\n";
		ret += "W W W\n";
		ret += "W W W\n";
		ret += "W W W\n";
		ret += " W W \n";
		return ret;
	}

	public String x() {
		String ret = "";
		ret += "X   X\n";
		ret += " X X \n";
		ret += "  X  \n";
		ret += " X X \n";
		ret += "X   X\n";
		return ret;
	}

	public String y() {
		String ret = "";
		ret += "Y   Y\n";
		ret += " YYY \n";
		ret += "  Y  \n";
		ret += "  Y  \n";
		ret += "  Y  \n";
		return ret;
	}

	public String z() {
		String ret = "";
		ret += "ZZZZZ\n";
		ret += "   Z \n";
		ret += "  Z  \n";
		ret += " Z   \n";
		ret += "ZZZZZ\n";
		return ret;
	}

}
