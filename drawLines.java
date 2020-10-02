//Psuedo code 
//listen for click get start coordinate draw a line to end click coordinates
//https://docs.oracle.com/javase/tutorial/uiswing/events/mousemotionlistener.html
//import java.awt.event.MouseEvent;
//import java.awt.Point;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
//import acm.program.GraphicsProgram;
//MouseEvent MouseEvent = MOUSE_CLICKED;
//public static final int MOUSE_CLICKED = 0 ;
//addMouseListener = MouseEvent;

public class drawLines extends GraphicsProgram {
	
	
	public void run() {
//		draw(){
//			startPoint();
//			endPoint();
//		line(null);
//		addMouseListener = MouseEvent;
//		addMouseListeners(MouseEvent);
		addMouseListeners();
//		addMouseMotionListener(MouseMotionListener listener);
//
	}
//
//	public GObject line(double startX, double startY,double endX, double endY) {
//	public void mousePressed(MouseEvent start) {
//		double startX = start.getX();
//		double startY = start.getY();
//		GObject drawingLine = new GLine(startX,startY,endX,endY);
//		drawingLine.setLocation(startX, startY);
//		add(drawingLine);
//	}
	private GLine drawingLine;

	public void mousePressed(MouseEvent start){
//		getCoordinates()
//		double startX = start.getX();
//		double startY = start.getY();		
//		int lineStartPoint = start.getPoint();
//		return startX, startY;
//		System.out.print(startX, startY;);
		drawingLine = new GLine (start.getX(), start.getY(),start.getX(),start.getY());
		add(drawingLine);
//		drawingLine.setStartPoint(startX, startY);
//
	}
//
	public void mouseDragged (MouseEvent end) {
//		getCoordinates()
//		double endX = end.getX();
//		double endY = end.getY();
		drawingLine.setEndPoint(end.getX(),end.getY());
	}
//
//	private void getCoordinates() {
//		double xCoordinate = ;
//		double yCoordinate = ;
//		double xy = (xCoordinate, yCoordinate)
//		getPoint()
//	}
//	}
//
//	public void getCoordinates(MouseEvent coordinates) {
//		double endX = coordinates.getX();
//		double endY = coordinates.getY();
//		double startX = coordinates.getX();
//		double startY = coordinates.getY();
//		GLine.setStartPoint(startX, startY);
//		GLine.setEndPoint(endX, endY); 
//	}
//	????? don't need to be an object to be a instance 
//	public GLine drawingLine;
//	
//	public class drawLines (MouseEvent mouseDragged){
//		this.startX = startX;
//		this.startY = startY;
//		this.endX = endX;
//		this.endY = endY;
//	}
}