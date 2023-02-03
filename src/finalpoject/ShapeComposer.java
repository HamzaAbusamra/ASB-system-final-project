package finalpoject;

import java.util.List;

public class ShapeComposer extends Shape {

	public ShapeComposer(String color) {
		super(color);
	}

	private List<Shape> shapes;

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
