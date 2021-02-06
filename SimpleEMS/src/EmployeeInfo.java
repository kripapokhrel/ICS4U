
public class EmployeeInfo {

    
    // ATTRIBUTES
    private int empNum;
    private String firstName;
    private String lastName;
    protected double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS

    public EmployeeInfo(int eN, String fN, String lN, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	deductRate = dR;
    }
    
    public EmployeeInfo(int eN) {
        empNum = eN;
	firstName = "a";
	lastName = "z";
	deductRate = 0;
               
	}
	
    public EmployeeInfo(int eN, String fN, String lN){
		
        empNum = eN;
        firstName = fN;
        lastName = lN;	
        deductRate = 0;
              }
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }

    public double getDeductRate() {
	return(deductRate);
    }
    
}
