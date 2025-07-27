package atm1;

public class MainClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Atm1.showBalance();
	try
	{
		Atm1.deposit(200);
		Atm1.withDraw(500);
	}
	catch(DepositException | WithDrawException e)
	{
		System.out.println("Error :"+e);
	}
	}
}
