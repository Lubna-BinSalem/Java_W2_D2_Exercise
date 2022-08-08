public class TestBook {
    public static void main(String[] args) {
       Author a1=new Author("Ernest Hemingway", "ErnestHemingway@gmail.com",'m');
       Author a2=new Author("Stephen King", "StephenKing@gmail.com",'m');
       Author[] arr=new Author[2];
       arr[0]=a1;
       arr[1]=a2;

       Book b=new Book("Moby Dick", arr, 15);
        System.out.println(b.toString());

    }
}
