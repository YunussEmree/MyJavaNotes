public class Main {
    public static void main(String[] args) {

    Bird bird = new Bird();
    Mammals mammals = new Mammals();

    BirdManager birdManager = new BirdManager();
    MammalsManager mammalsManager = new MammalsManager();

    birdManager.Add();
    mammalsManager.List();



    }
}