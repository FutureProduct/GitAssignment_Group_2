
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitassignment_group2;

/**
 *
 * @author gamer
 */
public class GitAssignment_group2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    // This is a simple function to print AIDAN HAHN
    public void Aidan() {
        System.out.println("Aidan Hahn / Roarkel");
    }
    
    public void Micah()
    {
        System.out.println("Micah Bosko / FutureProduct");
    }
    
    // This is a simple function to print SIMON RICHARD
    public void Simon() {
        System.out.println("Simon Richard / jsimonrichard");
    }

    public void Nithish() {	
    	System.out.println("Nithish / sickn");
    }

    public void Ruslan() {	
	System.out.println("Ruslan Averin / ErnakSalmander");
    }

    public void David(){
	System.out.println("David Gramo / dgramo03");    
    }
    
    public void Paul(){
	System.out.println("Paul Siders / LethalForceMan");    
    }
    
    public String[] getGroupMembers() {
    	return new String[] {
    			"Simon Richard",
                "Micah Bosko", 
                "Paul Siders",
                "Ruslan Averin",
		"David Gramo",
                "Nithish"
    	};
    }
    
    public int divide(int num1, int num2) {
    	if(num2 == 0) {
            //throw ArithmeticException("div by zero");
            return -1;
    	}
    	
    	int quotient = 0;
    	while(num1 >= num2) 
        {
            num1 -= num2;
            quotient++;
    	}
    	
    	return quotient;
    }
    
    public int multiply(int num1, int num2) {
    	int product = 0;
    	for(int i = 0; i < num1; i++) {
    		product += num2;
    	}
    	return product;
    }
    
    public int power(int num1, int num2) {
    	int p = 1;
    	for(int i = 0; i < num2; i++) {
    		p = multiply(p, num1);
    	}
    	return p;
    }  
}
