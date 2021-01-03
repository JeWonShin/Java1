
public class AccountingIFApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]); //arg = string, ... srting to double(Double.parseDouble() 
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;	
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;  
		double dividend2;
		double dividend3;
		
		if(income > 10000) {				// Á¶°Ç¹®.
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		
		
		System.out.println("Value of supply : "+valueOfSupply); // string to variable : alt + shift + L
		System.out.println("VAT : "+ vat);
		System.out.println("Total : "+ total);
		System.out.println("Expense : "+ expense);
		System.out.println("Income : " +income);
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);

		
	}

}
	// how to run this java program on external exist : 
    // 1. find location this javaprogram and copy 2. run cmd 3. paste javaprogram's location 
    // 4. Enter dir to check if there is a class file in the path 5. If there is no class file, enter javac + java file to create a class file
	// 6. enter java + javafile's name(ex. AcoountingApp) + Value you want to enter (33333.0)