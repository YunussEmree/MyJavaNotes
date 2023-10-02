# Yorum Satırı
//       => Bu sembolden sonrasını yorum satırı olarak ayarlar ve kodunuzda bu kısım çalıştırılmaz. Düzenli ve anlaşılabilir kodlar için gereklidir.

/*  */   => Bu semboller arasındaki yerleri yorum satırı olarak ayarlar ve kodunuzda bu kısım çalıştırılamaz. Düzenli ve anlaşılabilir kodlar için gereklidir. Çoklu yorum satırlarında kullanılır.


# Veri Tipleri

## Tam sayılar

### Byte
Bellekte 1 byte/8 bit yer kaplar
-128 den 127 ye kadarki olan tam sayıları tutabilen veri tipidir.

### Short
Bellekte 2byte yer kaplar.
-32768 den 32767 ye kadarki olan tam sayıları tutabilen veri tipidir.

### Integer
Bellekte 4byte yer kaplar.
-2147483648 den 2147483647 ye kadarki olan tam sayıları tutabilen veri tipidir.

### Long
Bellekte 64byte yer kaplar.
-9,223,372,036,854,775,808 den 9,223,372,036,854,775,807 ye kadarki olan tam sayıları tutabilen veri tipidir.


## Ondalıklı Sayılar

### Float
Bellekte 4byte yer kaplar.
7 haneye kadar duyarlıdır.
-3.4x10^38 den 3.4x10^38 e kadarki olan ondalıklı sayıları tutabilen veri tipidir.

### Double
Bellekte 8byte yer kaplar.
15 haneye kadar duyarlıdır.
-1.7x10^308 den 1.7x10^308 e kadarki olan ondalıklı sayıları tutabilen veri tipidir.

## Karakterler

### Char
Bellekte 1byte yer kaplar.
Tek bir karakter(1,K,? gibi) tutabilen veri tipidir.


## Alfasayısal veri tipi

### String
Bellekte 8byte yer kaplar.
Karakter dizisi şeklinde çalışır.
"Hello world!", "Üniversite 1. sınıf öğrencisiyim." gibi veri tiplerini tutabilir.

### Boolean
Bellekte 1bit yer kaplar
Sadece True(1) ve False(0) verilerini tutabilir.


# Operatörler

## Matematiksel Operatörler

+ => Toplama operatörü         => 5 + 5 çıktısı 10
- => Çıkarma operatörü         => 5 - 3 çıktısı 2
* => Çarpma operatörü          => 5 * 3 çıktısı 15
"/" => Bölme operatörü         => 15 / 3 çıktısı 5
^ => Üs alma operatörü         => 5 ^ 3 çıktısı 125
% => Mod operatörü             => 12 % 5 çıktısı 2
 // Bu operatör bölmeden kalan sayıyı çıktı olarak verir.


## Aritmetik Atama Operatörleri

+= => Topla ve ata operatörü    => x += 5 kodunun açılımı x = x + 5 şeklindedir ve x değeri 5 artacaktır.
-= => Çıkar ve ata operatörü    => x -= 5 kodunun açılımı x = x - 5 şeklindedir ve x değeri 5 azalacaktır.
*= => Çarp ve ata operatörü     => x *= 5 kodunun açılımı x = x * 5 şeklindedir ve x değeri 5 ile çarpılacaktır.
/= => Böl ve ata operatörü      => x /= 5 kodunun açılımı x = x / 5 şeklindedir ve x değeri 5 e bölünecektir.
++ => 1 Ekle operatörü          =>  x++   kodunun açılımı x = x + 1 şeklindedir ve x değeri 1 artacaktır.
-- => 1 çıkar operatörü         =>  x--   kodunun açılımı x = x - 1 şeklindedir ve x değeri 1 azalacaktır.


## Karşılaştırma Operatörleri

== => Eşit mi operatörü          => 5 == 6 çıktısı false
!= => Eşit değil mi operatörü    => 5 != 6 çıktısı true
<  => Küçüktür operatörü         => 5 < 10 çıktısı true
>  => Büyüktür operatörü         => 5 > 10 çıktısı false
=> => Büyük eşit operatörü       => 5 => 5 çıktısı true
=< => Küçük eşit operatörü       => 5 =< 5 çıktısı true


## Mantıksal Operatörler

&& => Ve(and) operatörü          => 5 == 5 && 10 != 7 çıktısı true
|| => Veya(or) operatörü         => 5 == 5 || 10 == 6 çıktısı true
! => Değil operatörü             => !(5 == 10) çıktısı true


# Koşullar 

## if koşulu 
=> Eğer içindeki koşul sağlanırsa devamındaki methodları çalıştırır
 if(5 == 10){  x = 10; }
 => Burada 5 ile 10 birbirine eşit olmadığı için {} sembolleri arasındaki kod çalışmamıştır.
 if(10 == 10){  x = 10; }
 => Burada 10 ile 10 birbirine eşit olduğu için {} sembolleri arasındaki kod çalıştırılıp x değeri 10 olarak değiştirilecektir.

### else if koşulu 
=> Eğer önceki if kodu çalıştırılmadıysa ve else if koşulu sağlanıyorsa içindeki kod çalıştırılır.
 if(10 == 10) { x = 10; }
 else if(10 == 10) {x = 15}
 => Burada if koşulunun içerisindeki koşul sağlandığı için else if koşulu sağlansa bile else if kodu çalışmayacaktır.
 if(5 == 10) { x = 10; }
 else if(10 == 10) {x = 15}
 => Burada if koşulunun içerisindeki koşul sağlanmadığı için ve else if koşulu sağlandığı için else if içerisindeki kod çalıştırılacak ve x değeri 15 olarak değiştirilecektir.

### else koşulu 
=> Eğer öncesindeki hiçbir koşul sağlanmadıysa herhangi bir koşulu kontrol etmeksizin içerisindeki kodu çalıştıracaktır.
if(5 == 10) {x = 10}
else {x = 15}
=> Burada if koşulu sağlanmadığı için ve başka koşul kalmadığı için else kodu devreye girip x değeri 15 olarak atanacaktır.

### Koşula bağlı operatör
?: (Ternary Operator)/(Koşula Bağlı Operatör) => bu operatör mantığı if else den gelmektedir. x ? y : z şeklinde kullanılan bu operatör de x in istenilen koşul, koşul sağlanırsa dönecek veri y, koşul sağlanmazsa dönecek veri z dir.

x > 0 ? x : -x
=> Bu kodda bir x değeri isteniyor ve bu x değerinin koşulu "x > 0" dur, eğer x değişkeni 0 dan büyükse x in kendisi çıktı olacaktır fakat x değişkeni 0 dan küçükse - ile çarpılıp yani -x değeri çıktımız olacaktır.


## Switch Case koşulu
=> Uzun uzun if else ler kullanmak yerine bunu tercih etmeniz hem kod okunabilirliği hem de performansı olumlu yönde etkileyecektir.
int i = 3 // i ye 3 değerini verdik ve veri tipini int yani tam sayı olarak belirledik
switch(i){
        case 1: // eğer değer 1 ise yapılacakları belirliyoruz.
                System.out.println("i değeri 1 dir."); // bu method ile tırnaklar arasındaki veriyi konsola yazdıracağız yani eğer i değerimiz 1 olsaydı konsolda "i değeri 1 dir." yazısı çıkacaktı.
                break; // bu ifade koşuldan çıkmamızı sağlayacaktır. Eğer bu ifadeyi kullanmazsanız tüm case yapılarının çıktısını verecektir ve kodumuz istediğmiz şekilde çalışmayacaktır.
        case 2:
                System.out.println("i değeri 2 dir.");
                break;
        case 3: // x değerimiz 3 olduğu için bu kısımdaki kod çalışacaktır.
                System.out.print.ln("i değeri 3 tür."); // kodumuzu çalıştırdığımızda konsolumuzda "i değeri 3 tür." yazısını göreceğiz.
                break; 
}



