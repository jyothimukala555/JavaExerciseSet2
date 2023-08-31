package com.javaExSet2Opps;

	
	public class Square {

	    private int side;

	  
	    public Square(int side) {
	    	this.side=side;
	    }

	    public int calculateArea() {
	        // TODO: Calculate and return the area of the square
	        if (side<=0){
	        return -1;
	        }
	        else{
	        this.side = side *side;
	        System.out.println(this.side);
			return this.side;
	        }
	    }

	    public int calculatePerimeter() {
	        // TODO: Calculate and return the perimeter of the square
	         if (side<=0){
	        return -1;
	        }
	        else{
	        this.side = 4 *side;
	        System.out.println(this.side);
			return this.side;
	        }
	    }
 public static void main (String [] args) {
	Square sqr = new Square(5);
	sqr.calculateArea();
	sqr.calculatePerimeter();
 }
	}
