public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString(){
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object point){
        if (point == null || !(point instanceof ThreeDPoint)){
            return false;
        }
        ThreeDPoint point1 = (ThreeDPoint) point;
        return (super.equals(point)) && (this.z == point1.z);
    }
}
