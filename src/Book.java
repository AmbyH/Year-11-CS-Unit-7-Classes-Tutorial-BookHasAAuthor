public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String a, Author b, double c, int d) {
        name = a;
        author = b;
        price = c;
        quantity = d;
    }

    //get name, author, price
    public String getName() {
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double a){
        price = a;
    }
    public int getQty(){
        return quantity;
    }
    public void setQty(int a) {
        quantity = a;
    }

    @Override
    public String toString() {
        return "\'" + name + "\' by " + author.toString();
    }
}
