class ArraysDemo{
	public static void main(String[] args){
		String[] strArr = new String[5];
		strArr[1] = "hey!";	
		for(int i = 0; i< strArr.length; i++){
			if(strArr[i] != null)
				System.out.println(strArr[i]);
		}

		int[] intArr = new int[10];
		intArr[1] = 2;
		intArr[2] = 3;
		for(int k : intArr){
			System.out.println(k);
		}
		String days[] = {"mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
		for(String day : days){
			System.out.print(day + " "); 
		}
	}
}