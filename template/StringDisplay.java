package template;

public class StringDisplay extends AbstractDisplay{
	private String str;
	private int len;
	public StringDisplay(String str) {
		this.str = str; 
		this.len = str.getBytes().length;
		}
	
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < this.len; i++)
			System.out.print("-");
		System.out.println("+");
	}
	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + this.str + "|");
	}

	@Override
	public void close() {
		printLine();
	}

}
