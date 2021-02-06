/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah and Kripa
 */

// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {
    
    /**
     *
     */
    public double yearlySalary;
    
    /**
     *
     * @param eN
     * @param fN
     * @param lN
     * @param s
     * @param wL
     * @param dR
     * @param yS
     */
    public FTE (int eN, String fN, String lN,double dR, double yS) {
        super(eN, fN, lN,dR);
        yearlySalary = yS;
        
    }
    
    
    //METHODS
    
    public double calcNetAnnualIncome() {
        
        double net = (1.0 - deductRate) * yearlySalary;
        return net;
        
    }
    
    //GETTERS AND SETTERS
        
    public double getYearlySalary(){
       return yearlySalary;
    }
    
}
