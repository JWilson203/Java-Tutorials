class Condition{
	public static void main (String[] args){
		int num1 = 1357;
		int num2 = 2468;

		String result;

		//checks if num1 is odd or even
		result = (num1 % 2 != 0) ? "Odd" : "Even";
		System.out.println(num1 + " is " + result);

		//checks if num2 is odd or even
		result = (num2 % 2 != 0) ? "Odd" : "Even";
		System.out.println(num2 + " is " + result);

	}
}