
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]); //arg = string, ... srting to double(Double.parseDouble() 
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;	
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		// double rate1 = 0.5;
		// double rate2 = 0.3;
		// double rate3 = 0.2;
		// ... If there are counts of many variables(rate1,2,3, ... ), then those (variables) are dirty.
		// double dividend1 = income * rate1;
		// double dividend2 = income * rate2;
		// double dividend3 = income * rate3;
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		double[] dividendRates = new double[3];       //  Array of double data
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2; 
		
		double dividend1 = income * dividendRates[0]; // By using arrays, the variables became one and it became clear that each value(dividendRates..) was related.
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
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