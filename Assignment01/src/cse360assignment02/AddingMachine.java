package cse360assignment02;

public class AddingMachine {
	
	private int total;
	private String history = "0"; //history should start from the initial 0
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  //return the current total
	  public int getTotal () {
	    return total;
	  }
	  
	  //add the parameter to the total variable
	  public void add (int value) {
		  total = total + value;
		  history += " + " + value;
	  }
	  
	  //subtract the parameter from the total variable
	  public void subtract (int value) {
		  total = total - value;
		  history += " - " + value;
	  }
	  
	  //history of the transactions 
	  public String toString () {
	    return history;
	  }
	  
	  //clear "memory"
	  public void clear() {
		  history = "0";
	  }
}
