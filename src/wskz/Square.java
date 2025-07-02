package wskz;
public final class Square extends Figure {
    private Square(Point a, Point b) {
        setPoint(a.getX(), a.getY());
        setPoint(a.getX(), b.getY());
        setPoint(b.getX(), b.getY());
        setPoint(b.getX(), a.getY());
    }
    public Square(double x1, double y1) { this(x1, y1, 0, 0); }
    public Square(double x1, double y1, double x2, double y2) {
        setPoint(x1, y1);
        setPoint(x1, y2);
        setPoint(x2, y2);
        setPoint(x2, y1);
    }
    @Override
    public double calculatePerimiter() {
        var seg = getSegments();
        return seg.getFirst().getLength() * 4;
    }
    @Override
    public double calculateField() {
        var seg = getSegments();
        return seg.getFirst().getLength() * seg.getFirst().getLength();
    }
    @Override
    public void addPoint(double x, double y) {
        setPoint(x, y);
    }
    @Override
    public int getPointsNumber() {
        return 0;
    }
}
