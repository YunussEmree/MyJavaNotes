public class Main {
    public static void main(String[] args) {

        BaseLogger logger = new BaseLogger();

        CustomerManager customerManager = new CustomerManager(new BaseLogger());
        customerManager.add();
    }
}