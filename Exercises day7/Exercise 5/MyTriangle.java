public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1,int x2, int y2,int x3, int y3){
        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3 ){
        this.v1=new MyPoint(v1.getX(),v1.getY());
        this.v2=new MyPoint(v2.getX(),v2.getY());
        this.v3=new MyPoint(v3.getX(),v3.getY());
    }
    public String toString(){
        return "MyTriangle[v1=("+this.v1.getX()+","+this.v1.getY()+"),v2=("+this.v2.getX()+","+this.v2.getY()+"), v3=("+this.v1.getX()+","+this.v1.getY()+")]";
    }
    public double getPerimeter(){
        double lengthV1=getLength(this.v1.getX(),this.v1.getY(),this.v2.getX(),this.v2.getY());
        double lengthV2=getLength(this.v2.getX(),this.v2.getY(),this.v3.getX(),this.v3.getY());
        double lengthV3=getLength(this.v3.getX(),this.v3.getY(),this.v1.getX(),this.v1.getY());
        return lengthV1+lengthV2+lengthV3;
    }
    private double getLength(double x1, double y1, double x2, double y2){
       return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
    public String getType(){
        double lengthV1=getLength(this.v1.getX(),this.v1.getY(),this.v2.getX(),this.v2.getY());
        double lengthV2=getLength(this.v2.getX(),this.v2.getY(),this.v3.getX(),this.v3.getY());
        double lengthV3=getLength(this.v3.getX(),this.v3.getY(),this.v1.getX(),this.v1.getY());
/*

        System.out.println(lengthV1);
        System.out.println(lengthV2);
        System.out.println(lengthV3);
*/

        if(lengthV1==lengthV2&&lengthV2==lengthV3&&lengthV3==lengthV1){
            return  "equilateral";
        }else if(lengthV1==lengthV2||lengthV2==lengthV3||lengthV3==lengthV1){
            return "isosceles";
        }else {
            return "scalene";
        }
    }
}
