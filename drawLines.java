//Psuedo code 
//listen for click get start coordinate draw a line to end click coordinates

//import java.awt.event.MouseEvent;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
//import acm.program.GraphicsProgram;

public class drawLines extends GraphicsProgram {
	public void run() {
//		draw(){
//			startPoint();
//			endPoint();
		line();
		}
		
	private void line() {
		GObject line = new GLine(startPoint(),endPoint());
	}
		
	private void startPoint(MOUSE_CLICKED start) {
//		getCoordinates()
		double lineStartPoint = getPoint()
		return lineStartPoint;

	}
	private void endPoint(MOUSE_CLICKED end) {
//		getCoordinates()
		double lineEndPoint = getPoint();
		return lineEndPoint;
	}
	
//	private void getCoordinates() {
//		double xCoordinate = ;
//		double yCoordinate = ;
//		double xy = (xCoordinate, yCoordinate)
		getPoint()
	}


	
	}

}
