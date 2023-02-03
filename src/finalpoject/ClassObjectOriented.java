package finalpoject;

import java.util.ArrayList;
import java.util.List;

public class ClassObjectOriented {
	

	public ClassObjectOriented() {
		// TODO Auto-generated constructor stub
		
		class Shape {
		    private String color;
		    
		    public Shape(String color) {
		        this.color = color;
		    }
		    
		    public String getColor() {
		        return color;
		    }
		    
		    public void setColor(String color) {
		        this.color = color;
		    }
		    
		    public double calculateArea() {
		        return 0.0;
		    }
		}

		

		class Rectangle extends Shape {
		    private double width;
		    private double height;
		    
		    public Rectangle(String color, double width, double height) {
		        super(color);
		        this.width = width;
		        this.height = height;
		    }
		    
		    public double getWidth() {
		        return width;
		    }
		    
		    public void setWidth(double width) {
		        this.width = width;
		    }
		    
		    public double getHeight() {
		        return height;
		    }
		    
		    public void setHeight(double height) {
		        this.height = height;
		    }
		    
		    @Override
		    public double calculateArea() {
		        return width * height;
		    }
		}

		class ShapeComposer {
		    private List<Shape> shapes;
		    
		    public ShapeComposer() {
		        shapes = new ArrayList<>();
		    }
		    
		    public void addShape(Shape shape) {
		        shapes.add(shape);
		    }
		    
		    public void removeShape(Shape shape) {
		        shapes.remove(shape);
		    }
		    
		    public double calculateTotalArea() {
		        double total = 0.0;
		        for (Shape shape : shapes) {
		            total += shape.calculateArea();
		        }
		        return total;
		    }
		}
	}

}
