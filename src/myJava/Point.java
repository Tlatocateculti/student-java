package myJava;

class Point {
    double x=.0d;
    double y=.0d;
    public Point() {}
    public Point(double x) {this.x=x;}
    public Point(double x, double y) {this.x=x; this.y=y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public double getX() { return this.x; }
    public double getY() { return this.y; }
}
