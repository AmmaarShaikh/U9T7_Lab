public class Point {
    private int x;
    private int y;
    private String label;

    public Point (String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object point){
        if (point == null || !(point instanceof Point)){
            return false;
        }
        Point point1 = (Point)point;
        return (this.x == point1.x) && (this.y == point1.y);
    }

    @Override
    public String toString(){
        return "Point" + label + " is at x = " + x + ", y = " + y;
    }
}
