class Logic{
	public static void main (String[] args){
		boolean yes = true;
		boolean no = false;
		
		//test if two conditions are both true
		System.out.println("Both YesYes True: " + ( yes && yes ));
		System.out.println("Both YesNo True: " + ( yes && no ));

		//to test if either of the two conditions are true 
		System.out.println("Either YesYes True: " + ( yes || yes ));
		System.out.println("Either YesNo True: " + ( yes || no ));
		System.out.println("Either NoNo True: " + ( no || no ));

		//show original and inverse values
		System.out.println("Original Yes value: " + yes );
		System.out.println("Inverse Yes value: " + !yes );

	}
}