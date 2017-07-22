import static java.lang.Math.random;

public class PointsField {
	private double[][] Field;
    private double xrange;

    PointsField(int numPoints, double xrange)
    {
        this.Field = new double[numPoints][2];
        this.xrange = xrange;
    }

    void generateRandomPointsOnField()
    {
        for(int i=0; i<this.Field.length; i++)
        {
            this.Field[i][0] = Math.random()*this.xrange;
            this.Field[i][1] = Math.random()*this.xrange;
        }
    }

    //finds the distance from (x,y) to some reference point (center)
    private double metric(double x, double y, double reference)
    {
        return Math.sqrt(Math.pow(x-reference,2)+Math.pow(y-reference, 2));
    }

    int getTotalPointsInCircle()
    {
        int counter = 0;
        double center = this.xrange;

        for(int i=0; i<this.Field.length; i++)
        {
            double distance = this.metric(this.Field[i][0],this.Field[i][1], center);
            if(distance <= center)
            {
                counter++;
            }
        }
        return counter;
    }


}


