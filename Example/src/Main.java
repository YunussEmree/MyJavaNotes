public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product();
        product.description = "Casper Laptop";
        product.id = 1;
        product.name = "Laptop";
        product.price = 20000;
        product.stockAmount = 10;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}