package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10, 20);
		// point1.setX(10);
		// point1.setY(20);
		// drawPoint(point1);
		draw(point1);
		
		//point1.disappear();
		point1.show(false);
		
		
		ColorPoint point2 = new ColorPoint(100, 200, "red");
		// drawColorPoint(point2);
		// drawPoint(point2);
		draw(point2);
		
		// drawTriangle(new Triangle());
		// drawRectangle(new Rectangle());
		
		// drawShape(new Triangle());
		// drawShape(new Rectangle());
		// drawShape(new Circle());
		draw(new Triangle());
		draw(new Rectangle());
		draw(new Circle());
		
		draw(new GraphicText("Hello World"));
	}
	
	private static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	private static void drawPoint(Point point) {
//		point.show();
//	}

//	private static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}

//	private static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
//	private static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	private static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
	
}
