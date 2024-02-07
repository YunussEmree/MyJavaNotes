public abstract class GameCalculator {
    public abstract void hesapla(); //GameCalculator extend edilen yerde hesapla kendi başına tanımlanmalıdır. Default değeri yoktur.

    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }
}
