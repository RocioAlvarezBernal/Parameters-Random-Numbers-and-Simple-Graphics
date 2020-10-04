
import acm.program.*;
import java.awt.Color;
import acm.graphics.*;
import acm.util.RandomGenerator;

public class PRNSG extends GraphicsProgram {
	// setting constants for para
	private static final double MIN_SIZE = 5;
	private static final double MAX_SIZE = 50;
	private static final int AMOUNT_OF_CIRCLES = 10;
	double boundryX = getWidth();
	double boundryY = getHeight();
//	Random rand = new Random();

	public void run() {
		// since we know how many 10 circles create a circle randomly until all 10 are
		// on screen
		for (int i = 1; i <= AMOUNT_OF_CIRCLES; i++) {
			createCircles();
		}
	}

	public void createCircles() {
		double randomX = createRandomX();
		double randomY = createRandomY();
		double randomWH = randomSize();

		GOval circles = new GOval((randomX/2), (randomY/2), randomWH, randomWH);
		circles.setFilled(true);
		randomColor();
		circles.setColor(randomColor());
		add(circles);
	}

	public double randomSize() {
		RandomGenerator randSize = RandomGenerator.getInstance();
		double size = randSize.nextDouble(MIN_SIZE, MAX_SIZE);
		return size;
	}

//	
	public double createRandomX() {
		double boundryX = getWidth();
		RandomGenerator createRandomX = RandomGenerator.getInstance();
		double placeX = createRandomX.nextDouble(0.0, boundryX);
		return placeX;
	}

	public double createRandomY() {
		double boundryY = getHeight();
		RandomGenerator createRandomY = RandomGenerator.getInstance();
		double placeY = createRandomY.nextDouble(0.0, boundryY);
		return placeY;
	}
	
	public Color randomColor() {
		RandomGenerator ranColor = RandomGenerator.getInstance();
		Color coloring = ranColor.nextColor();
		return coloring;
//		return ranColor;
//		System.out.print(ranColor);
//		Color test = ranColor.nextColor();
	}



}
