/**
 * Created by kolesnik_s on 09.01.16.
 */
public class FindLength {
    private double pointX1;
    private double pointY1;
    private double pointX2;
    private double pointY2;

    public FindLength(double pointX1, double pointY1, double pointX2, double pointY2) {
        this.pointX1 = pointX1;
        this.pointY1 = pointY1;
        this.pointX2 = pointX2;
        this.pointY2 = pointY2;
        this.calculateDistance();
    }

    public double getPointX1() {
        return pointX1;
    }

    public void setPointX1(double pointX1) {
        this.pointX1 = pointX1;
    }

    public double getPointY1() {
        return pointY1;
    }

    public void setPointY1(double pointY1) {
        this.pointY1 = pointY1;
    }

    public double getPointX2() {
        return pointX2;
    }

    public void setPointX2(double pointX2) {
        this.pointX2 = pointX2;
    }

    public double getPointY2() {
        return pointY2;
    }

    public void setPointY2(double pointY2) {
        this.pointY2 = pointY2;
    }

    public void calculateDistance() {
        double distance = -1;
        double xPonitsDifference = -1;
        double yPointsDifference = -1;

        xPonitsDifference = this.getPointX2() - this.getPointX1();
        yPointsDifference = this.getPointY2() - this.getPointY1();

        distance = Math.sqrt(Math.pow(xPonitsDifference,2) + Math.pow(yPointsDifference, 2));

        System.out.println("Distance is "+distance+" points");
    }
}
