package wskz;

public class Triangle extends Figure
{
    public Triangle() {}

    public Triangle(Point a, Point b) {
        setPoint(0, 0);
        setPoint(a.getX(), a.getY());
        setPoint(b.getX(), b.getY());
    }

    public Triangle(double x1, double y1, double x2, double y2) {
        setPoint(0, 0);
        setPoint(x1, y1);
        setPoint(x2, y2);
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        setPoint(x1, y1);
        setPoint(x2, y2);
        setPoint(x3, y3);
    }

    @Override
    public double calculateField() {

    }
}
