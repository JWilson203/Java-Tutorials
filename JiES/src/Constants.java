class Constants{
	public static void main (String[] args){
	
	//constant integer scores
	final int TOUCHDOWN = 6;
	final int CONVERSION = 1;
	final int FIELDGOAL = 3;

	//calculate points scored
	int td, pat, fg, total;

	//points calculation
	td = 4 * TOUCHDOWN;
	pat = 3 * CONVERSION;
	fg = 2 * FIELDGOAL;
	total = (td + pat + fg);

	//output calculated total
	System.out.println("Score: " + total);
	}
}