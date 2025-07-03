package myJava;
public final class Triangle extends Figure
{
    public Triangle() {}
    private Triangle(Point a, Point b) {
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
        var seg = getSegments();
        double p = 0;
        for (Segment s : seg)
            p += s.getLength();
        p /= 2;
        return Math.sqrt(p * (p - seg.getFirst().getLength()) * (p - seg.get(1).getLength()) * (p - seg.getLast().getLength()));
    }
    @Override
    public void addPoint(double x, double y) {
        setPoint(x, y);
    }
    @Override
    public int getPointsNumber() {
        return getPoints() == null ? 0 : getPoints().size();
    }
}
