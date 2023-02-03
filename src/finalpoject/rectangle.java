package finalpoject;

public class rectangle extends Shape{

	    public rectangle(String color) {
		super(color);
	}

		private double width;
	    private double height;
	    
	    public rectangle(String color, double width, double height) {
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