public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }

    public void add(BaseLogger baseLogger){
        baseLogger.log("");
    }

}
