package interface_practise;

public class InterfaceMainMethod {

	public static void main(String[] args) {
		AxisBankChennai obj =new AxisBankChennai();
		obj.credit();
		obj.debit();
		obj.loan();
		obj.transaction();
		obj.prize();
		
		System.out.println("");
		System.out.println("Method call from child class");
		System.out.println("");
		
		AxisBankChromepet obj1=new AxisBankChromepet();
		obj1.credit();
		obj1.debit();
		obj1.loan();
		obj1.transaction();
		obj1.prize();
		obj1.lottery();
		//obj1.tokencounter();
		AxisBankChromepet.tokencounter();

		System.out.println("");
		System.out.println("Method call from Base class with obj reference to child class");
		System.out.println("");
		
		AxisBankChennai obj2 =new AxisBankChromepet();
		obj2.credit();
		obj2.debit();
		obj2.loan();
		obj2.transaction();
		obj2.prize();
		
		System.out.println("");
		System.out.println("Static Interface Method");
		System.out.println("");
		RBS_Bank.hello();
		
	}

}
