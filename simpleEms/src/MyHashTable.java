/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah and Kripa
 */
import java.util.*;

public class MyHashTable {
    	
// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<EmployeeInfo>[] buckets;
	private int numInHashTable;

	
// CONSTRUCTOR

public MyHashTable(int howManyBuckets) {
    // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

    // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];

	// For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
	}
		
	numInHashTable = 0;
	}

//METHODS
        
public int getNumInHashTable(){
    return numInHashTable;
    }
        
        
        
public int calcBucket(int keyValue) {
    // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
    return(keyValue % buckets.length);
    }
	
        
        
public boolean addEmployee(EmployeeInfo theEmployee) {

    // Add the employee to the hash table.  Return true if employee is added successfully,
    // return false otherwise.
		
    if (theEmployee == null) {
        return(false);
    }
    else {
        int targetBucket = calcBucket(theEmployee.getEmpNum());
        // We add the employee to the ArrayList for the targetBucket.
        boolean addStatus = buckets[targetBucket].add(theEmployee);
        numInHashTable++;
        return addStatus;
         }
		
} // end AddEmployee
	
	
        
public int searchByEmployeeNumber (int empNum) {
    /*We have to find the position of the employee in the Arraylist for the bucket
    that the employee hashes to, if the employee doesn't get found/isn't in the database
    then we have to return the integer value of -1 .*/
          
    //We are heading into the targetBucket to narrow our search
    int targetBucket = calcBucket(empNum);
            
    //Now we have to walk through the Arraylist to look for the
    //employee if its even in there.
            
    for (int j = 0; j < buckets[targetBucket].size(); j++){
        if (empNum == buckets[targetBucket].get(j).getEmpNum()){
            return(j); 
            //The employee number is for the employee at the j position in the 
            //target bucket's ArrayList.
        }
    }
           return(-1); //This basically means that the employee is not in the system
            
}//end searchByEmployeeNumber
        
        
      //Not really necessary because this isn't implemented in the actual user interface
      //But we'll keep it
public EmployeeInfo searchByFirstLastName (String fName, String lName){
    /*
        To find this employee we are going to search the whole hash table using
        the first and last name. If the employee is in the database, we will return the 
        reference to that employee. If we don't find the employee/the employee is not in the database,
        we will return null.
   */
        
    for (int i = 0; i < buckets.length; i++){
        for (int j = 0; j < buckets[i].size(); j++){
            String theFName = buckets[i].get(j).getFirstName();
            String theLName = buckets[i].get(j).getLastName();
            if ((fName.equals(theFName)) && (lName.equals(theLName))) {
                EmployeeInfo theEmployee = buckets[i].get(j);
                return(theEmployee); //Employee has been found in the database
            }
        }    
    }
    return(null);
        
} //The end of searchByFirstLastName
        
        
        
public EmployeeInfo removeEmployee(int empNum){
   /*
    We'll remove the employee from the hash table and return the reference to that employee.
    If the employee isn't in the database, we'll return null.
   */
            
    int targetBucket = calcBucket(empNum);
    int positionInArrayList = searchByEmployeeNumber(empNum);
            
    if (positionInArrayList < 0){
    //Basically if the employee is not in this ArrayList for this
    //targetBucket
    return(null);
    
    }
    else{
        EmployeeInfo employeeBeingRemoved = buckets[targetBucket].remove(positionInArrayList);
        numInHashTable--;
        return (employeeBeingRemoved);
    }
        
}//end removeEmployee
        
        
        
public void displayContents() {
    System.out.println ("\n\n Here are all the recorded employees in the system:");
            
    System.out.println ("\n There are " + numInHashTable + " employees in the system");
            
    /*We'll print out the employee numbers stored in each bucket's ArrayList,
    we'll do this by starting in bucket 0 and continuing into bucket 1, etc. It'll
    be done in a systematic/understandable way.
    */
            
    for (int i = 0; i < buckets.length; i++) {
    //For the current bucket were in, we're printing out the empNum for each item
    //in its ArrayList
                
        System.out.println("\n Here are the employees in bucket# " + i );
        //We're displaying the employees in this current bucket
        if (buckets[i].size() == 0) {
        System.out.println ("   There are no employees stored in this bucket!");
        }
        else{
        //We have employees stored in this bucket and we're going to display the empNum 
        //for each employee
                
            for (int j = 0; j < buckets[i].size(); j++) {
                int theEmpNum = buckets[i].get(j).getEmpNum();
                System.out.println ("Employee: " + theEmpNum);
            }
        }
    }
}// Here is the end of displayContents
}//Here's the end of MyHashTable
