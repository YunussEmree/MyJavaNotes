public class ProductManager {
    public static void add(Product product){
        if(ProductValidator.isValid(product)) System.out.println("Ürün eklendi: " + product.name);
        //Yapıcı blok staticte çalışmaz. Bu durum C# da farklıdır.
        else System.out.println("Ürün doğrulanamadı.");

    }
}
