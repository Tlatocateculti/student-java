package wskz;

import java.util.ArrayList;
import java.util.List;

class Figure {
    private List<Point> points;

    void setPoint(double a, double b) {
        if (points == null) {
            points = new ArrayList<>();
        }
        points.add(new Point(a, b));
    }

    /*klasa nie może zostać zainicjowana!
      jedynie mogą zostać wykorzystane jej elementy!
     */
    Figure() {};

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
                point = null;
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

    protected double calculatePerimiter() {
        double r = 0;
        for(Segment s : calcSegments()) {
            r+=s.getLength();
        }
        return 0;
    }

    public double calculateField() {

        return 0;
    }
}
