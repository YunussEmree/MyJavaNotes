public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", "Casper Laptop", 20000, 10);
        Product product2 = new Product();
        product2.setDescription("Lenovo Laptop");
        product2.setId(2);
        product2.setName("Laptop");
        product2.setPrice(16000);
        product2.setStockAmount(20);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);

        System.out.println("product2: " + product2.getName() + product2.getDescription() + product2.getPrice());
        System.out.println("product1: " + product1.getName() + product1.getDescription() + product1.getPrice());
    }
}