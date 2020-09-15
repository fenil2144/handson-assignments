class TaxCalculation{
	public static void main(String args[]){
		double profit = Integer.parseInt(args[1]);
		double taxAmount = 0;
		double totalWithTax = 0;
		if(profit > 0){
		switch (args[0]){
			case "ka":
				taxAmount = 0.1 * profit;	// (10%)
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Karnataka = "+totalWithTax );
				break;
			case "tn":
				taxAmount = 0.095 * profit;	// (9.5%)
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Tamilnadu = "+totalWithTax );
				break;
			case "gj":
				taxAmount = 0.09 * profit;	// (9%)
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Gujarat = "+totalWithTax );
				break;
			case "mh":
				taxAmount = 0.105 * profit;	// (10.5%)
				totalWithTax = profit + taxAmount;
				System.out.println("Total amount for Maharashtra = "+totalWithTax );
				break;
			}
		          }
		          else if(profit == 0){
			System.out.println("Total amount for your Null profit = 0");
			}
		          else{
		System.out.println("Profit can't be Negative!");
		}
		}
	}