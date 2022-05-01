package User_Registration;

import java.util.Scanner;
import java.util.regex.Pattern;


@FunctionalInterface
interface validate {
	public boolean compute(String value);
}
public class User 
{

	private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String MOBILE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";
	private static final String EMAIL = "^[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,3}[,]?[.]?[a-z]?$";

	private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}";

	validate Fname =(fnm)  ->{

		Pattern pattern = Pattern.compile(FIRST_NAME);
		boolean result = pattern.matcher(fnm).matches();
		return result ;
	};


	validate Lname = (lnm)-> {

		Pattern pattern = Pattern.compile(LAST_NAME);
		boolean result = pattern.matcher(lnm).matches();
		return result ;
	};

	
	validate MobileNumber = (mob)->{

		Pattern pattern = Pattern.compile(MOBILE_NUMBER);
		boolean result = pattern.matcher(mob).matches();
		return result ;
	};
	
	validate EmailId = (email)->{

		Pattern pattern = Pattern.compile(EMAIL);
		boolean result = pattern.matcher(email).matches();
		return result ;
	};

	validate password = (String pwd) ->{

		Pattern pattern = Pattern.compile(PASSWORD);
		boolean result = pattern.matcher(pwd).matches();
		return result ;
	};

	Scanner in = new Scanner(System.in);

	public String getfname() {
		System.out.println("Enter the first name : ");
		String fname = in.next();
		return fname ;
	}

	public String getlname() {
		System.out.println("Enter the last name : ");
		String lname = in.next();
		return lname ;
	}

	public String getemail() {
		System.out.println("Enter the email id : ");
		String emailid = in.next();		
		return emailid ;
	}

	public String getMobnumber() {
		System.out.println("Enter the mobile number : ");
		String pnumber = in.next();
		return pnumber ;
	}

	public String getPassword() {
		System.out.println("Enter the password : ");
		String password = in.next();
		return password ;
	}

	public static void main(String[] args) {
		User u=new User();

	}

}



