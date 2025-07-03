package myJava;
import java.util.ArrayList;
import java.util.List;
public abstract class Figure implements Misc {
    Figure() {};
    private List<Point> points;
    void setPoint(double a, double b) {
        if (points == null) {
            points = new ArrayList<>();
        }
        points.add(new Point(a, b));
    }
    public List<Point> getPoints() {
        return points;
    }
    protected List<Segment> getSegments() {
        return calcSegments();
    }
    /*klasa nie może zostać zainicjowana!
      jedynie mogą zostać wykorzystane jej elementy!
     */
    private List<Segment> calcSegments() {
        if (points.toArray().length > 1) {
            var seg = new ArrayList<Segment>();
            Point point = null;
            for (Point p : points) {
                if (point==null) {
                    point = p;
                    continue;
                }
                Segment s = new Segment();
                s.calculate(point, p);
                seg.add(s);
                point = p;
            }
            if (point != null) {
                Segment s = new Segment();
                s.calculate(point, points.getFirst());
                seg.add(s);
            }
            return seg;
        }
        var seg = new ArrayList<Segment>();
        seg.add(new Segment());
        return seg;
    }
    public double calculatePerimiter() {
        double r = 0;
        for(Segment s : calcSegments()) {
            r+=s.getLength();
        }
        return r;
    }
    public double calculateField() {
    /* Pole jest zawsze zależne od figury; stąd domyślnie zwraca wartość 0 */
        return 0;
    }
    public abstract void addPoint(double x, double y);
}
