public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setZ(z);
        super.setXY(x,y);
    }
    public float[] getXYZ(){
    float array[]={super.getX(), super.getY(), this.getZ()};
    return array;}

    public String toString(){
        return "("+super.getX()+","+super.getY()+","+this.getZ()+")";
    }
}
