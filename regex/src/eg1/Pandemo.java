package eg1;

public class Pandemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BNZAA2318J");
	}
		public static boolean isValidpan(String pan) {
			boolean b=false;
			if(pan.length()==10&& Character.isUpperCase(pan.charAt(9)))
					{
				int upper=0;
				for (int i = 0; i <5; i++) {
					if(Character.isUpperCase(pan.charAt(i))) {
					
					upper++;
				}
					}
					
		}
			return b;
			
		}
}

	


