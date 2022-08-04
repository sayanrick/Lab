package Aug_4th_Lab_Session;


public class TaxCalculator {

	double calculateTax(String empName, boolean isIndian, double empSal) {
		if(!isIndian) // if the employee is not Indian then this exception will occur
			throw new CountryNotValidException  // custom exception
			("The employee should be an Indian citizen for calculating tax", new RuntimeException());
		
		if(empName == null) //If the value of name is null that means user does not want to provide name so this exception will occure
			throw new EmployeeNameNotValidException  // custom exception
			("The employee name can not be empty", new RuntimeException());
		
		if (empSal>100000 && isIndian)
			return empSal * 8/100; // tax calculation
		else if (empSal<=100000 && empSal>=50000 && isIndian)
			return empSal * 6/100; // tax calculation
		else if (empSal<=50000 && empSal>=30000 && isIndian)
			return empSal * 4/100; // tax calculation
		else
			throw new TaxNotEligibleException("The Employee does not need to pay tax", new RuntimeException());
			
	} 

}

class CalculatorSimulator {
	public static void main(String args[]) {
		TaxCalculator c = new TaxCalculator();  // making an object of class TaxCalculator
//		System.out.println("Tax amount is:- " + c.calculateTax("Ron", false, 34000));
//		System.out.println("Tax amount is:- " + c.calculateTax("Tim", true, 1000));
//		System.out.println("Tax amount is:- " + c.calculateTax( "Jack", true,55000));
		System.out.println("Tax amount is:- " + c.calculateTax(null, true,55000));
	}
}


class CountryNotValidException extends RuntimeException{
	public CountryNotValidException() {
		
	}
	
	public CountryNotValidException(String s, Throwable cause) {
		super(s, cause);
	}
}

class TaxNotEligibleException extends RuntimeException{
	public TaxNotEligibleException() {
		
	}
	
	public TaxNotEligibleException(String s, Throwable cause) {
		super(s, cause);
	}
}

class EmployeeNameNotValidException extends RuntimeException{
	public EmployeeNameNotValidException() {
		
	}
	
	public EmployeeNameNotValidException(String s, Throwable cause) {
		super(s, cause);
	}
}

