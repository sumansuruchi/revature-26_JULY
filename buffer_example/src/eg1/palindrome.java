package eg1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispalindrome("madam"));
		int x=121;
		System.out.println(ispalindrome(x + ""));
		System.out.println(ispalindrome("madama"));
		System.out.println(dispalindromshorthan("madam"));
		 x=122;
		System.out.println(dispalindromshorthan(x + ""));
		System.out.println(dispalindromshorthan("madama"));

	}
	public static boolean ispalindrome(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
		}
	public static boolean dispalindromshorthan(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);		
	}

}
