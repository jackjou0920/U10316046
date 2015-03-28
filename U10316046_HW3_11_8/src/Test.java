/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.8
 */
public class Test {
	public static void main(String[] args) {
		Account account = new Account(1122, 1000, "George");
		account.setAnnualInterestRate(1.5);
		//Withdraw & deposit money
		account.deposit(30);
	    account.deposit(40);
	    account.deposit(50);
	    account.withdraw(5);
	    account.withdraw(4);
	    account.withdraw(2);
	    //Display name, rate, now balance
	    System.out.println("Name: " + account.getName());
	    System.out.println("Annual interest rate: " + account.getAnnualInterestRate() +"%");
	    System.out.println("Balance: " +(int)account.getBalance());
	    System.out.printf("\n%-6s%-8s%-9s%16s\n", "Type", "Amount", "Balance", "Date");
	    
	    java.util.ArrayList<Transaction> list = account.getTransactions();
	    
	    for(int i = 0; i < list.size(); i++){
	    	Transaction transaction = list.get(i);
	    	System.out.printf("%3s%8s%10s%32s\n", transaction.getType(), transaction.getAmount(), transaction.getBalance(), transaction.getDateCreated());
	    	
	    }   
	}
}
