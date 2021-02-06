/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah and Kripa
 */
    
// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN,dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    public double calcNetAnnualIncome() {
        
        double net = (1.0 - deductRate) * hourlyWage * hoursPerWeek * weeksPerYear;
        return net;
        
    }
    
     //Getters and Setters
        
        public double getHourlyWage(){
            return hourlyWage;
        }
        
        public double getHoursPerWeek(){
            return hoursPerWeek;
        }
        
        public double getWeeksPerYear(){
            return weeksPerYear;
        }
	

    
}
