public class ProductManager {
    public void add(Product product) {
        System.out.println("Ürün eklendi: " + product.getName());



    }

    //overloading örneği
    public void add(int id, String name, String description, double price, int stockAmount) {
        System.out.println("Ürün eklendi: " + name);
        Product product = new Product();

        product.setId(id);
        product.setName(name);
        product.setTradeMark(description);
        product.setPrice(price);
        product.setStockAmount(stockAmount);

    }
}
