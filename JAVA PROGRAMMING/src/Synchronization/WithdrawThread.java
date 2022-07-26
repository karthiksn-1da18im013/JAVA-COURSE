package Synchronization;

public class WithdrawThread {

	AccountClass obj;
	int amt;
	//String msg;
	
	public WithdrawThread(AccountClass obj, int amt,String msg) {	
		this.obj = obj;
		this.amt = amt;
		
		//this.msg=msg;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("First");
		obj.withdraw(amt);
	}
}