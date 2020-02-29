package interface_practise;

public class AxisBankChennai implements RBS_Bank, Axis_Bank{
	
	int rate =20;
	int fact=30;
	
	@Override
	
	public void loan() {
		System.out.println("Axis_Bank_Loan_Method");
		fact=fact+100;
		rate=rate+100;
		System.out.println(fact+"\t"+rate);
		RBS_Bank.hello();
	}

	@Override
	public void credit() {
		System.out.println("Axis_Bank_Credit_Method");		
	}

	@Override
	public void debit() {
		System.out.println("Axis_Bank_Debit_Method");	
	}

	@Override
	public void prize() {
		System.out.println("Axis_Bank_Prize_Method");
	}

	@Override
	public void transaction() {
		System.out.println("Axis_Bank_Transaction_Method");
	}
	
	

}
