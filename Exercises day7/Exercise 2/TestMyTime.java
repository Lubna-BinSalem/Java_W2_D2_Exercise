public class TestMyTime {
    public static void main(String[] args) {
        myTime m =new myTime(0, 0, 0);
        System.out.println(m.nextSecond());
        System.out.println(m.previousSecond());
        System.out.println(m.previousSecond());
        System.out.println(m.toString());

        myTime m2 =new myTime(23, 59, 59);
        System.out.println(m2.nextSecond());

    }
}
