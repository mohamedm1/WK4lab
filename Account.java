
public class Account {

	static int numAccounts =0;
	static int getNumAccounts() {
		return numAccounts;
		
	}
	
	Account(){
		numAccounts += 1;
		
	}
	
	
	public static void main(String[] args) {
		
		Account num1 = new Account();
		
		System.out.println(getNumAccounts());
		
		Account num2 = new Account();
		
		Account num3 = new Account();
		
		

		
		
		System.out.println("Number of accounts: " + getNumAccounts());
	}

	
	public static int getnumAccounts() {
		return numAccounts;
}
}
