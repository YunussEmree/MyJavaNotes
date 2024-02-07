public class Product {

    //Constructor & Yapıcı Blok örneği
    public Product(int id, String name, String description, double price, int stockAmount){
        setStockAmount(stockAmount);
        setPrice(price);
        setName(name);
        setTradeMark(description);
        setId(id);
    }
    public Product(){

    }

    private int _id;
    private String _name;
    private String _trademark;
    private double _price;
    private int _stockAmount;


    //Hızlı getter setter ayarlamak için sağ tıkla -> refactor -> Encapsulate fiels -> ayarları yap ve refactor e tıkla

    //getter
    public int getId() {
        return _id;
    }
    //setter
    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getTradeMark() {
        return _trademark;
    }

    public void setTradeMark(String description) {
        _trademark = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }
}
