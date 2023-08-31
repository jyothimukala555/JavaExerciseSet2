package com.javaExSet2Opps;

public class TwoDCoOrdinatesXY {
	// Defining a Point class to represent a point in 2-dimensional space
	
	    
	    // x-coordinate of the point
	    private int x;

	    // y-coordinate of the point
	    private int y;

	    // Constructor for the Point class
	    public TwoDCoOrdinatesXY(int x, int y) {
	        this.x = x;  // Assigning x-coordinate of the point
	        this.y = y;  // Assigning y-coordinate of the point
	    }

	    // Method to get the x-coordinate of the point
	    public int getX() {
	        return x;
	    }

	    // Method to get the y-coordinate of the point
	    public int getY() {
	        return y;
	    }

	    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
	    public void move(int dx, int dy) {
	        // Your code here
	        this.x =this.x + dx;
	        this.y =this.y + dy;
	    }

	    // TODO: Implement the method to calculate the distance from this point to another point
	    public double distanceTo(TwoDCoOrdinatesXY other) {
	        int diffX = this.x - other.x;
	        int diffY = this.y - other.y;
	        return Math.sqrt(diffX *diffX + diffY * diffY);
	        // Your code here
	    }
	}

