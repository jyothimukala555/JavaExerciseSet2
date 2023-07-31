package com.javaExSet2Opps;

public class Dimension {


	    private int feet;
	    private int inches;
	    
	    public Dimension(int inches) {
	 
	      if(inches<0){
	      this.feet=-1;
	      this.inches=-1;
	      }
	      else
	      {
	      this.feet = inches/12;
	      this.inches =inches%12;
	      } 
	    }
	    
	    
	    public int getFeet() {
	   return feet;
	   
	        
	    }
	    
	    public int getInches() {
	        return inches;
	        
	    }    
	
 public static void main (String [] args) {
	 Dimension dim = new Dimension(25);
			 
	   System.out.println(dim.getFeet());
	  
 }
}
--------------------------------------------------------------------------


	
