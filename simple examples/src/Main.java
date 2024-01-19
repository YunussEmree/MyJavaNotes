import java.util.*;

public class Main {

    public static void main(String[] args) {



    }







//    Scanner scanner = new Scanner(System.in);
//
//    int[] dizi = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            dizi[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(dizi);
//        System.out.println(Arrays.toString(dizi));


    //Scanner scanner = new Scanner(System.in);
//
    //int kucuk;
    //int buyuk;
    //int sayi;
//
    //sayi = scanner.nextInt();
    //kucuk = sayi;
    //buyuk = sayi;
//
    //while (sayi != 0){
    //    if(sayi < kucuk) kucuk = sayi;
    //    if(sayi > buyuk) buyuk = sayi;
//
    //    sayi = scanner.nextInt();
    //}
    //System.out.println("Küçük: " + kucuk + ", Büyük: " + buyuk);


//    Scanner scanner = new Scanner(System.in);
//
//    int sayi1 = scanner.nextInt();
//    int sayi2 = scanner.nextInt();
//    int ebob = 1;
//
//        for (int i = Math.min(sayi1,sayi2); i >= 1; i--) {
//            if(Math.max(sayi1,sayi2) % i == 0){
//                ebob = i;
//                break;
//            }
//        }
//        System.out.println("Ebob: " + ebob);
//        System.out.println("Ekok: " + (sayi1*sayi2)/ebob);


//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt(); //her satırda 2 yıldız == h*2-1 kadar yıldız
//
//
//        for (int i = 1; i <= h; i++) {
//            int basbosluk = h - i;
//            for (int j = 0; j < basbosluk; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i*2-1; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//        int[] dizi = new int[15];
//        dizi[0] = 1;
//        dizi[1] = 1;
//
//        for (int i = 2; i < 15; i++) {
//            dizi[i] = dizi[i-2] + dizi[i-1];
//        }
//        System.out.println(Arrays.toString(dizi));



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("sayi sayısını giriniz: ");
//        int sayi = scanner.nextInt();
//        double a = 0;
//
//        int n = 0;
//
//        int temp = sayi;
//        while (temp != 0) { //basamak sayısını bulma
//            temp /= 10;
//            n++;
//        }
//        temp = sayi;
//
//        for (int i = 0; i < n; i++) { //armstrong değerini bulma
//            a += Math.pow(temp%10,n);
//            temp /=10;
//        }
//        if(a == sayi) System.out.println("Bu bir armstrong sayı");
//        else System.out.println("Bu bir armstrong sayı değil");

/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String metin = scanner.nextLine();
        System.out.print("\n");

        System.out.print("Bir harf girin: ");
        char harf = (char) scanner.next().charAt(0);

            for (int i = 0; i < metin.length(); i++) {
                char arananharf = metin.charAt(i);
                if(arananharf == harf){
                    System.out.println("a bulundu: " + i);
                }
            }
        }
 */

/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İki basamaklı sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("\n");

        String[] birler = {"bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] onlar = {"on ", "yirmi ", "otuz ", "kırk ", "elli ", "altmış ", "yetmiş ", "seksen ", "doksan "};
        String sonuc = "";

        int temp = sayi;

        int bir = temp %10;
        temp = temp/10;
        int on = temp %10;
        temp = temp/10;

        if(sayi == 0){
            sonuc = "sıfır";
        } else if(sayi < 0){
            sonuc = "eksi ";
            sonuc = sonuc + onlar[on-1];
            sonuc = sonuc + birler[bir-1];
        } else {
            sonuc = sonuc + onlar[on-1];
            sonuc = sonuc + birler[bir-1];

        }

        System.out.print("Sayının okunuşu: " + sonuc);
    }
 */

    /*
    static void kat3(int[] dizi, int dizisinir){
        for (int i = 0; i < dizisinir; i++) {
            dizi[i] = dizi[i] * 3;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olacak: ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];
        int[] carpilmisdizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". elemanı giriniz: ");
            int sayi = scanner.nextInt();
            dizi[i] = sayi;
        }

        System.out.print("Dizi neyle çarpılacak: ");
        int k = scanner.nextInt();

        //for (int i = 0; i < n; i++) {
        //    carpilmisdizi[i] = dizi[i] * k;
//
        //    System.out.println((i+1) + ". eleman: " + carpilmisdizi[i]);
        //}
        kat3(dizi,n);
        System.out.println(Arrays.toString(dizi));
    }
    */

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olacak: ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];
        int[] carpilmisdizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". elemanı giriniz: ");
            int sayi = scanner.nextInt();
            dizi[i] = sayi;
        }

        System.out.print("Dizi neyle çarpılacak: ");
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            carpilmisdizi[i] = dizi[i] * k;

            System.out.println((i+1) + ". eleman: " + carpilmisdizi[i]);
        }
    }
     */

/*
    static void carpimtablo(int basla, int bit){
        for (int j = basla; j <= bit; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print((i * j) + "\t");
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Başlangıç değerini giriniz: ");
        int baslangic = scn.nextInt();
        System.out.print("Bitiş değerini giriniz: ");
        int bitis = scn.nextInt();

        carpimtablo(baslangic,bitis);

    }

 */
/*
    static boolean AsalMi(int sayi){
        boolean asal = true;
        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0) asal = false;
        }

        return asal;
    }

    public static void main(String[] args) {

        System.out.println(AsalMi(2));

    Scanner scn = new Scanner(System.in);
        System.out.print("Dizi uzunluğunu girin: ");
        int diziuzunluk = scn.nextInt();
        int[] asalsayilar =  new int[diziuzunluk];
        int asalsayilarindex = 0;
        int dizi[] = new int[diziuzunluk];

        System.out.print("Dizi elemanlarını giriniz:");

        for (int i = 0; i < diziuzunluk; i++) {
            int sayi = scn.nextInt();
            dizi[i] = sayi;
            if(AsalMi(sayi)){
                asalsayilar[asalsayilarindex] = sayi;
                asalsayilarindex++;
            }
        }

        System.out.println("Dizideki Asal Sayılar: ");
        for (int a: asalsayilar) {
            if(a == 0) break;
            System.out.print(a + " ");
        }
    }
 */
/*
        Scanner scn = new Scanner(System.in);

        System.out.print("Matris satır sayısını girin: ");
        int matrissatirsayi = scn.nextInt();

        System.out.print("Matris sütun sayısını girin: ");
        int matrissutunsayi = scn.nextInt();

        int[][] matris = new int[matrissatirsayi][matrissutunsayi];
        int[][] tersmatris = new int[matrissatirsayi][matrissutunsayi];



        for (int i = 0; i < matrissutunsayi; i++) {
            for (int j = 0; j < matrissatirsayi; j++) {
                System.out.print((i*3+j) + ". elemanı giriniz: ");
                int girilensayi = scn.nextInt();

                matris[j][i] = girilensayi;
                tersmatris[i][j] = girilensayi;
            }
        }

        System.out.println("Matris: ");
        for (int i = 0; i < matrissutunsayi; i++) {
            for (int j = 0; j < matrissatirsayi; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.print(" \n");
        }
        System.out.println("Ters Matris: ");
        for (int i = 0; i < matrissutunsayi; i++) {
            for (int j = 0; j < matrissatirsayi; j++) {
                System.out.print(tersmatris[j][i] + " ");
            }
            System.out.print(" \n");
        }

*/


    /*
    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {


        int[] sayilar = new int[100];
        Scanner scn = new Scanner(System.in);
        int sayi = 0;

        System.out.print("Dizinin boyutunu giriniz: ");
        int diziboyutu = scn.nextInt();

        for (int i = 0; i < diziboyutu; i++) {
            System.out.print("Dizi["+i+"]: ");
            sayi = scn.nextInt();
            sayilar[i] = sayi;
        }

        int[] tersdensayilar = new int[100];

        tersdensayilar = reverse(sayilar);

        for (int i: tersdensayilar) {
            if(i == 0) continue;
            System.out.print(i + ",");
        }
     */


        /*
        Scanner scn = new Scanner(System.in);
        int sayi = 0;
        int toplam =0;

        System.out.print("Dizinin boyutunu giriniz: ");
        int diziboyutu = scn.nextInt();

        for (int i = 0; i < diziboyutu; i++) {
            System.out.print("Dizi["+i+"]: ");
            sayi = scn.nextInt();

            toplam += (int) Math.pow(sayi,2);
        }
        System.out.println("Dizideki Sayıların Karelerinin Toplamı: " + toplam);
         */

        /*
        boolean bulundu = false;
        int sayac = 0;
        int[] sayilar = new int[20];

        Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayı tahmin edin: ");
        int tahmin = scn.nextInt();

        for (int i = 1; i <= 20; i++) {
            int sayi = (int) (Math.random() * 100);
            sayilar[i-1] = sayi;
            if(sayi == tahmin) {
                bulundu = true;
                break;
            }
            sayac++;
        }
        System.out.println("Dizi: " + Arrays.toString(sayilar));
        if(bulundu) System.out.println("aranan sayı bulundu. index: " + sayac);
        else System.out.println("Aranan sayı yok");


         */

/*
        Scanner scn = new Scanner(System.in);
        System.out.print("Kaçtan Başlasın: ");
        int sayibaslangic = scn.nextInt();
        System.out.print("Kaça Kadar Yazılsın: ");
        int sayibitis = scn.nextInt();

        int sayiadedi = 0;
        double toplam = 0;
        double ortalama = 0;

        for (int i = sayibaslangic; i <= sayibitis; i++) {
            System.out.print(i + ", ");
            sayiadedi++;
            toplam+= i;
        }
        ortalama = toplam/sayiadedi;

        System.out.println("\nŞu kadar sayı var: " + sayiadedi);
        System.out.println("Sayıların ortalaması: " + ortalama);


 */
/*
        Scanner scn = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayi1 = scn.nextInt();
        System.out.println("2. sayıyı giriniz");
        int sayi2 = scn.nextInt();
        System.out.println("3. sayıyı giriniz");
        int sayi3 = scn.nextInt();

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(sayi1);
        sayilar.add(sayi2);
        sayilar.add(sayi3);

        Collections.sort(sayilar);

        System.out.println(sayilar);
        */

/*
        Scanner scn = new Scanner(System.in);
        int sayi = scn.nextInt();

        for(int i = 1; i<=sayi; i++){
            if(sayi%i == 0) System.out.println("Bölen: " + i);
        }

 */
/*
    public static boolean asalmi(int sayi){
        if(sayi == 0 || sayi == 1) return false;

        for(int i = 2; i<sayi; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean ciftmi(int sayi){
        if(sayi % 2 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        String ciftler = "Çift sayılar: ";
        String asallar = "Asal sayılar: ";
        String sayilar = "Sayılar: ";
        for(int i = 1; i<=30; i++){
            int sayi = (int) Math.floor(Math.random()*100);
            sayilar = sayilar + sayi + ", " ;
            System.out.println("Sayı: " + sayi + ", Asal mı: " + asalmi(sayi) + ", Çift mi: " + ciftmi(sayi));
            if(ciftmi(sayi)) ciftler = ciftler + sayi + ", " ;
            if(asalmi(sayi)) asallar = asallar + sayi +  ", " ;
        }
        System.out.println(sayilar);
        System.out.println(ciftler);
        System.out.println(asallar);
    }
}
*/


/*
public class Main {
    public static String tersCevir(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String girilendeger = scanner.next();

        girilendeger = tersCevir(girilendeger);
        System.out.println(girilendeger);

    }
}

 */



/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Sayıyı giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int toplam = 0;
        while (0 < sayi){
            int basamak = sayi % 10;
            toplam += basamak;
            sayi= (int) Math.floor(sayi/10);
        }
        System.out.println(toplam);

    }
}

 */






/*
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Boyu giriniz");
        double boy = scn.nextDouble() / 100;
        System.out.println("Kiloyu giriniz");
        double kilo = scn.nextDouble();
        System.out.println("Cinsiyeti giriniz (erkek için 1, kadın için 0, atak helikopter için 2)");
        int cinsiyet = scn.nextInt(); //1 ise erkek 0 ise kadın

        double kitleindex = kilo / Math.pow(boy, 2);

        switch (cinsiyet){
            case 0: //kadın
                if(kitleindex < 19) System.out.println("İyi");
                else if(kitleindex > 19 && kitleindex < 25) System.out.println("Normal");
                else if(kitleindex > 25) System.out.println("Kilolu");

                break;
            case 1: //erkek
                if(kitleindex < 20) System.out.println("İyi");
                else if(kitleindex > 20 && kitleindex < 26) System.out.println("Normal");
                else if(kitleindex > 26) System.out.println("Kilolu");

                break;
            case 2: //atak helikopter
                System.out.println("HER TÜRLÜ İYİSİN BROM");
                break;
        }
        System.out.println("Vücut kitle endex: " + kitleindex);
        // hatalı formül        System.out.println("İdeal vücut kilosu: " + (50+2.3 * ((boy*2.54) - 60)));
    }
}

 */
    /*
    public static int fakhesaplama(int faktoriyel){
        int sonuc = 1;
        for(int i = 1; i <= faktoriyel; i++){
            sonuc *= i;
        }

        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(fakhesaplama(3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kümenin uzunluğunu giriniz");
        int kumelength = scanner.nextInt();
        System.out.println("Kombinasyonu giriniz");
        int komb = scanner.nextInt();

        int sonuc =  fakhesaplama(kumelength) / (fakhesaplama(komb) * fakhesaplama(kumelength-komb));

        System.out.println(sonuc);
    }
}

     */

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kenar uzunluğunu giriniz");
        Double kenaruzunluk = scanner.nextDouble();
        System.out.println("Yükseklik uzunluğunu giriniz");
        Double yukseklik = scanner.nextDouble();

        Double alan = (kenaruzunluk*yukseklik/2);

        System.out.println("Alan = " + alan);

 */

}