package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;
    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Point getBeginPoint() {
        return beginPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
    public Point getMidPoint() {
        int point1 = (beginPoint.getX() + endPoint.getX()) / 2;
        int point2 = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(point1, point2);
    }
}
// END
