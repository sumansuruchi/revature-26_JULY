package eg1;

public class Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business b1=new Business();
		
		
		try {
		if(b1.isValidaddhar("123456781111")) {
			System.out.println("aadhar Validated");
		}
		}catch(InvalidAddharException e){
			System.out.println(e.getMessage());
		}



	}

}
