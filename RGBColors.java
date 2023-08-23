package com.javaExSet2Opps;

public class RGBColors {

	// RGBColor class representing a color using Red Green Blue (RGB) model.
	
	    
	    // The Red, Green, Blue color values range from 0 to 255.
	    private int red;
	    private int green;
	    private int blue;

	    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
	  
	  
	    public RGBColors(int red, int green, int blue) {
	        // write your code here
	        this.red =red;
	        this.green = green;
	        this.blue = blue;
	    }

	    // Getter method to get the red value of the color.
	    public int getRed() {
	        // write your code here
	        return this.red;
	    }

	    // Getter method to get the green value of the color.
	    public int getGreen() {
	        // write your code here
	        return this.green;
	    }

	    // Getter method to get the blue value of the color.
	    public int getBlue() {
	        // write your code here
	        return this.blue;
	    }
	    
	    public static void main (String [] args) {
	    	RGBColors rgb = new RGBColors(45,55,120);
	    	System.out.println("Before inversion of RGB colors : "+rgb.getBlue()+","+rgb.getGreen()+","+rgb.getRed());
	    	rgb.invert();
	    	System.out.println("After inversion of RGB colors : "+rgb.getBlue()+","+rgb.getGreen()+","+rgb.getRed());

	    	}
	    // Method to invert the color. The inversion is done by subtracting each color component from 255.
	    public void invert() {
	        // write your code here
	        this.red =255-this.red;
	         this.green =255-this.green;
	           this.blue =255-this.blue;
	    }
	}


