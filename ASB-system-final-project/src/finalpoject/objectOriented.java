package finalpoject;

public class objectOriented {

	    public static void main(String[] args) {
	    	
	        ShapeComposer composer = new ShapeComposer();
	        
	        Circle circle = new Circle("Red", 5);
	        composer.addShape(circle);
	        
	        Rectangle rectangle = new Rectangle("Blue", 10, 20);
	        composer.addShape(rectangle);
	        
	        System.out.println("Total area: " + composer.calculateTotalArea());
	    }
	} 