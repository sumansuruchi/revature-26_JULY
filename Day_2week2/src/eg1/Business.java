package eg1;

public class Business {
	

	
		


	
	public boolean isValidaddhar(String a) throws InvalidAddharException{
		
		if(a!=null && a.matches("[0-9]{12}")) {
			return true;
		}else {
			throw new InvalidAddharException("Entered aadhar "+a+" is INVALID");
		}
	}
}

