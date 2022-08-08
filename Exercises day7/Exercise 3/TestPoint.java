public class TestPoint {
    public static void main(String[] args) {
        Point3D p3D= new Point3D(2,5,7);
        System.out.println(p3D.toString());
        p3D.setXYZ(1,1,1);
        System.out.println(p3D.toString());
    }
}
