import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
   /* public String toString(){
        String info="Book[name="+this.getName();
            info.concat(authors.toString());

            //System.out.println(i);
            //System.out.print(authors[i].toString());


        return info.concat(",price"+this.getPrice()+",qty="+this.getQty()+"]");
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorNames(){
        String names=authors[0].getName();
        for (int i = 1; i < authors.length; i++) {
            names=names+","+authors[i].getName();
        }
        return names;
    }
}

