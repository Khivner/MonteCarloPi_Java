import java.awt.*;
import java.util.Arrays;

public class PiFinder {
	    private int pointsInSquare;
	    private int pointsInCircle;

	    PiFinder(int pointsInSquare, int pointsInCircle)
	    {
	        this.pointsInSquare = pointsInSquare;
	        this.pointsInCircle = pointsInCircle;
	    }

	    double getValue()
	    {
	        return (double)4*this.pointsInCircle/this.pointsInSquare;
	    }
}

