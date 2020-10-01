//Psuedo code 
//listen for click get start coordinate draw a line to end click coordinates

//import java.awt.event.MouseEvent;
import java.awt.Point;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
//import acm.program.GraphicsProgram;
//MouseEvent mouse = MOUSE_CLICKED;
//public static final int MOUSE_CLICKED = 0 ;
//addMouseListener = MouseEvent;

public class drawLines extends GraphicsProgram {
	public void run() {
//		draw(){
//			startPoint();
//			endPoint();
//		ALine();
//		addMouseListener = MouseEvent;
//		addMouseListeners(MouseEvent);
		addMouseListeners();

	}

	public GObject line(MouseEvent coordinates) {
		GObject drawingLine = new GLine(startX,startY,endX,endY);
		add(drawingLine);
	}
//		
	public void startPoints(MouseEvent start) {
//		getCoordinates()
		double startX = start.getX();
		double startY = start.getY();		
//		int lineStartPoint = start.getPoint();
//		return startX, startY;
//		System.out.print(startX, startY;);
		line();
		GLine.setStartPoint(startX, startY);
		
	}

	public void endPoints(MouseEvent end) {
//		getCoordinates()
		double endX = end.getX();
		double endY = end.getY();
		GLine.setEndPoint.(endX, endY); 

	}

//	private void getCoordinates() {
//		double xCoordinate = ;
//		double yCoordinate = ;
//		double xy = (xCoordinate, yCoordinate)
//		getPoint()
//	}
//	}

////	public void getCoordinates(MouseEvent coordinates) {
//		double endX = coordinates.getX();
//		double endY = coordinates.getY();
//		double startX = coordinates.getX();
//		double startY = coordinates.getY();
////		GLine.setStartPoint(startX, startY);
////		GLine.setEndPoint(endX, endY); 
//	}

}
