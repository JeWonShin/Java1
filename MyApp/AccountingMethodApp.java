
public class AccountingMethodApp {
	public static double valueOfSupply;  // 전역변수로 적용(모든 메소드에서 동일하게 적용)
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		valueOfSupply = Double.parseDouble(args[0]); //arg = string, ... srting to double(Double.parseDouble()  
		vatRate = 0.1;
		expenseRate = 0.3;
				
		print();

		
	}

	private static void print() {
		System.out.println("Value of supply : "+valueOfSupply); // string to variable : alt + shift + L
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : " +getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getIncome();
	}

	private static double getExpense() {
		return valueOfSupply * getExpense();
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;		// This code is the code that make the method
	}

}
	// how to run this java program on external exist : 
    // 1. find location this javaprogram and copy 2. run cmd 3. paste javaprogram's location 
    // 4. Enter dir to check if there is a class file in the path 5. If there is no class file, enter javac + java file to create a class file
	// 6. enter java + javafile's name(ex. AcoountingApp) + Value you want to enter (33333.0)