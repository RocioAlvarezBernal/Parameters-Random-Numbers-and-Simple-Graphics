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
		line();
//		addMouseListener = MouseEvent;
		addMouseListeners();

		}
		
	private void line() {
		String sXY = (double) startPoint();
		String eXY = (double) endPoint();

		GObject line = new GLine(sXY,eXY);
		add(line);
	}
		
	private Point startPoint(MouseEvent start) {
//		getCoordinates()
		Point lineStartPoint = start.getPoint();
		return lineStartPoint;

	}
	private Point endPoint(MouseEvent end) {
//		getCoordinates()
		Point lineEndPoint = end.getPoint();
		return lineEndPoint;
	}
	
//	private void getCoordinates() {
//		double xCoordinate = ;
//		double yCoordinate = ;
//		double xy = (xCoordinate, yCoordinate)
//		getPoint()
//	}
//	}

}
