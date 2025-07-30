package Generic;

interface Category {}

class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name; this.price = price; this.category = category;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getName() { return name; }
    public T getCategory() { return category; }
}

class Catalog {
    private List<Product<? extends Category>> products = new ArrayList<>();
    public void addProduct(Product<? extends Category> product) { products.add(product); }
    public List<Product<? extends Category>> getProducts() { return products; }
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
    }
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 300, new ClothingCategory());
        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        applyDiscount(book, 10);
        System.out.println(book.getName() + " after discount: " + book.getPrice());
    }
}