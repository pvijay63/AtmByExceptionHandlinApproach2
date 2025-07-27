package atm1;

public class DepositException  extends RuntimeException{

	@Override
	public String toString()
	{
		return getClass()+": your not entering valid amount to deposit";
	}
	
	
}
