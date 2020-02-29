package interface_practise;

public interface RBS_Bank {
	int rate=9;
	int loan=13;
	
	public void loan();
	public void credit();
	public void debit();
	
	public static void hello()
	{
		System.out.println("Interface Static Method");
	}

}
