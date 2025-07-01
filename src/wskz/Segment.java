package wskz;

import java.math.*;

class Segment {
    double length;

    public Segment() {length=.0d;}

    public void calculate(Point a, Point b) {
        length = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
    }

    public double getLength() {return length;}
}
