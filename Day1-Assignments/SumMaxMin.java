class SumMaxMin{
	public static void main(String args[]){
 	int min = Integer.parseInt(args[0]), max = Integer.parseInt(args[0]), sum  = 0;
	int currentNumber = 0;
	for(int i=0; i<args.length; i++){
		currentNumber = Integer.parseInt(args[i]);
		if(currentNumber >max)
			max = currentNumber ;
		if(currentNumber <min)
			min = currentNumber ;
		sum = sum + currentNumber ;
	}
	System.out.println(max+" "+min+" "+sum);
	}
}