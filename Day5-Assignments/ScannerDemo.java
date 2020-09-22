import java.util.*;
class ScannerDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		System.out.println(number );
		
		sc.nextLine();

		System.out.println("Enter a Word");
		String word = sc.nextLine();
		System.out.println("Word = "+word);

		System.out.println("Enter a Boolean");
		boolean b = sc.nextBoolean();
		System.out.println("boolean  = "+b);
	}
}