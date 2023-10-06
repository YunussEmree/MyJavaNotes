public class Main {
    public static void main(String[] args) {

        CreditUI creditUI = new CreditUI();
        creditUI.Calculate(new BaseCreditManager(), 0.35, 10, 10000);
        creditUI.Calculate(new AgricultureCreditManager(), 0.35, 10, 10000);




    }
}