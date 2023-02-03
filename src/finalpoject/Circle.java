package finalpoject;

public class Circle {

		    private double radius;
		    
		    public Circle(String color, double radius) {
		    
		        this.radius = radius;
		    }
		    
		    public double getRadius() {
		        return radius;
		    }
		    
		    public void setRadius(double radius) {
		        this.radius = radius;
		    }
		    
		   
		    public double calculateArea() {
		        return Math.PI * radius * radius;
		    }
		}


