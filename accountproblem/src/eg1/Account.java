package eg1;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountno="01323567834";
		double balance=5000;
		System.out.println("account no"+accountno);
		System.out.println("account"+balance);
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Types of  transaction balance");
		System.out.println("---------------------------");
		char tractjectiontype= 'w';
		double tran_amount=2000;
		balance=balance-tran_amount;
		System.out.printf("%4c %12.2f %8.2f\n",tractjectiontype,tran_amount,balance);
		 tractjectiontype= 'D';
		 tran_amount=20000;
		balance=balance+tran_amount;
		System.out.printf("%4c %12.2f %8.2f\n",tractjectiontype,tran_amount,balance);
		 tractjectiontype= 'D';
		 tran_amount=500;
		balance=balance+tran_amount;
		System.out.printf("%4c %12.2f %8.2f\n",tractjectiontype,tran_amount,balance);
		 tractjectiontype= 'w';
		 tran_amount=15000;
		balance=balance-tran_amount;
		System.out.printf("%4c %12.2f %8.2f\n",tractjectiontype,tran_amount,balance);
		 tractjectiontype= 'w';
		 tran_amount=10000;
		balance=balance-tran_amount;
		System.out.printf("%4c %12.2f %8.2f\n",tractjectiontype,tran_amount,balance);
		System.out.println("---------------------------");
		
		
		
		

	}
	

}
