public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Phone", "Samsung", 6000, 10);
        Product product2 = new Product();
        product2.setTradeMark("Lenovo");
        product2.setId(2);
        product2.setName("Laptop");
        product2.setPrice(16000);
        product2.setStockAmount(20);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);

        System.out.println("product2: " + product2.getName() + ", " + product2.getTradeMark() + ", " + product2.getPrice() + ", " + product2.getStockAmount());
        System.out.println("product1: " + product1.getName() + ", " + product1.getTradeMark() + ", " + product1.getPrice() + ", " + product1.getStockAmount());
    }
}