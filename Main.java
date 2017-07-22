import java.awt.*;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		double x = 4.0;
        int n = 10000000;
        double pi;
        int runs = 10;
        double sum = 0.0;
        
        for(int i=0; i<runs; i++)
        {
        	PointsField points = new PointsField(n, x);
        	points.generateRandomPointsOnField();
        	PiFinder findpi = new PiFinder(n, points.getTotalPointsInCircle());
        	pi = findpi.getValue();
        	System.out.println("Pi = " + pi);
        	sum = sum + pi;
        }
        System.out.println("Avg Pi = " + sum/runs);
	}

}
