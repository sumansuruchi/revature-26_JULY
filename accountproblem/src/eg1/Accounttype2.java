package eg1;

public class Accounttype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=5000;
		String accountno="01323567834";
		System.out.println("account no"+accountno);
		System.out.println("account"+balance);
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Types of  transaction balance");
		balance=transcation('w',2000,balance);
		balance=transcation('D',20000,balance);
		balance=transcation('D',500,balance);
		balance=transcation('w',15000,balance);
		balance=transcation('w',10000,balance);
		
		System.out.println("---------------------------");
		

	}
	public static double transcation(char transtype ,double trancationamout, double balance) {
		if(transtype=='D') {
			balance+=trancationamout;
		}
		if(transtype=='w')
		{
			if(balance-trancationamout>=0)
			{
				balance-=trancationamout;
			}
		}
		
		System.out.printf("%4c %12.2f %8.2f\n",transtype,trancationamout,balance);
		return balance;

	}

}
