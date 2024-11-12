public class Point {
    private int x;
    private int y;

    //calculate distance between two points

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Point a = new Point(this.x, this.y);
        Point b = new Point(0, 0);

        double distance = Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
        return distance;
    }

    public double distance(Point b) {
        Point a = new Point(this.x, this.y);

        double distance = Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
        return distance;
    }

    public double distance(int x, int y) {
        Point a = new Point(this.x, this.y);
        Point b = new Point(x, y);

        double distance = Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
        return distance;
    }
}
