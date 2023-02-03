package finalpoject;

public class objectOriented extends rectangle {
	

	    public objectOriented(String color) {
		super(color);
	}

		public static void main(String[] args) {
	    
	        Circle a = new Circle("green",15);
	        
	        ShapeComposer b = new ShapeComposer("Red");
	        
	        rectangle c = new rectangle("Blue", 10, 20);
	        Shape d = new Shape("Yellow");
	        
	        System.out.println("Total area: " + c.calculateArea());
	    }
	} 