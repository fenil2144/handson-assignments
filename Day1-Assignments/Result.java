class Result{
	public static void main(String args[]){
		int resultPercentage = Integer.parseInt(args[0]);
		if(resultPercentage > 100 || resultPercentage < 0)
			System.out.println("Invalid Percentage");
		else{
		if(resultPercentage >= 70)
			System.out.println("First Class With Distinction");

		else if(resultPercentage >= 60 && resultPercentage < 70)
			System.out.println("First Class");

		else if(resultPercentage >= 50 && resultPercentage < 60)
			System.out.println("Second Class");

		else if(resultPercentage >= 35 && resultPercentage < 50)
			System.out.println("Pass");

		else if(resultPercentage < 35)
			System.out.println("Fail");
		}
	}
}