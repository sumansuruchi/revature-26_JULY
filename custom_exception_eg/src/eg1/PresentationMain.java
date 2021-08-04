package eg1;

public class PresentationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Businessvalidation b1=new Businessvalidation();
		try {
			if(b1.isValidAge(34)) {
				System.out.println("Age VALIDATED");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(b1.isValidPan("ABCDE1222Q")) {
			System.out.println("Pan Validated");
		}
		}catch(IsvalidPan e){
			System.out.println(e.getMessage());
		}



	}

}
