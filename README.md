# Ufak Notlar
this -> bu class demek

Önerilan ide -> Intellij Idea
Önerilen Intellij Idea eklentileri: Atom Material Icons(Dosya ikonlarını değiştiriyor), Material Theme UI(Intellij görünümünü değiştiriyor.)


# Bazı Kısayollar
Ctrl + alt + o => removing unused imports
Ctrl + Shift + alt + l => kodun satırlarını hizalar.
Intellij içinden herhangi bir class koduna sağ tıkla -> refactor -> Encapsulate fields -> ayarları yap ve refactor e tıkla -> Encapsulation(getter/setter) yapmanın kısa yolu
                                               ya da -> ilgili süslü parantez içerisinde sağ tık yap generate e tıkla ve orada üretmek istediğin şeyi yaz.


# Yorum Satırı
//       => Bu sembolden sonrasını yorum satırı olarak ayarlar ve kodunuzda bu kısım çalıştırılmaz. Düzenli ve anlaşılabilir kodlar için gereklidir.

/*  */   => Bu semboller arasındaki yerleri yorum satırı olarak ayarlar ve kodunuzda bu kısım çalıştırılamaz. Düzenli ve anlaşılabilir kodlar için gereklidir. Çoklu yorum satırlarında kullanılır.


# Veri Tipleri

## Tam sayılar

### Bit
1 ve 0 rakamlarını alabilir.

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
Bellekte 8byte yer kaplar.
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
Bellekte 1bit yer kaplar. 
Sadece True(1) ve False(0) verilerini tutabilir. 


# Operatörler

## Matematiksel Operatörler

"+" => Toplama operatörü         => 5 + 5 çıktısı 10 <br>
"-" => Çıkarma operatörü         => 5 - 3 çıktısı 2 <br>
"*" => Çarpma operatörü          => 5 * 3 çıktısı 15 <br>
"/" => Bölme operatörü           => 15 / 3 çıktısı 5 <br>
"^" => Üs alma operatörü         => 5 ^ 3 çıktısı 125 <br>
"%" => Mod operatörü             => 12 % 5 çıktısı 2 <br>
  // Bu operatör bölmeden kalan sayıyı çıktı olarak verir. 


## Aritmetik Atama Operatörleri

"+=" => Topla ve ata operatörü    => x += 5 kodunun açılımı x = x + 5 şeklindedir ve x değeri 5 artacaktır. <br>
"-=" => Çıkar ve ata operatörü    => x -= 5 kodunun açılımı x = x - 5 şeklindedir ve x değeri 5 azalacaktır. <br>
"*=" => Çarp ve ata operatörü     => x *= 5 kodunun açılımı x = x * 5 şeklindedir ve x değeri 5 ile çarpılacaktır. <br>
"/=" => Böl ve ata operatörü      => x /= 5 kodunun açılımı x = x / 5 şeklindedir ve x değeri 5 e bölünecektir. <br>
"++" => 1 Ekle operatörü          =>  x++   kodunun açılımı x = x + 1 şeklindedir ve x değeri 1 artacaktır. <br>
"--" => 1 çıkar operatörü         =>  x--   kodunun açılımı x = x - 1 şeklindedir ve x değeri 1 azalacaktır. <br>


## Karşılaştırma Operatörleri

"==" => Eşit mi operatörü          => 5 == 6 çıktısı false <br>
"!=" => Eşit değil mi operatörü    => 5 != 6 çıktısı true <br>
"<"  => Küçüktür operatörü         => 5 < 10 çıktısı true <br>
">"  => Büyüktür operatörü         => 5 > 10 çıktısı false <br>
">=" => Büyük eşit operatörü       => 5 => 5 çıktısı true <br>
"<=" => Küçük eşit operatörü       => 5 =< 5 çıktısı true


## Mantıksal Operatörler

"&&" => Ve(and) operatörü          => 5 == 5 && 10 != 7 çıktısı true <br>
"||" => Veya(or) operatörü         => 5 == 5 || 10 == 6 çıktısı true <br>
"!" => Değil operatörü             => !(5 == 10) çıktısı true


# Koşullar 

## if koşulu 
=> Eğer içindeki koşul sağlanırsa devamındaki methodları çalıştırır <br>
 if(5 == 10){  x = 10; } <br>
 => Burada 5 ile 10 birbirine eşit olmadığı için {} sembolleri arasındaki kod çalışmamıştır. <br>
 if(10 == 10){  x = 10; } <br>
 => Burada 10 ile 10 birbirine eşit olduğu için {} sembolleri arasındaki kod çalıştırılıp x değeri 10 olarak değiştirilecektir.

### else if koşulu 
=> Eğer önceki if kodu çalıştırılmadıysa ve else if koşulu sağlanıyorsa içindeki kod çalıştırılır. <br>
 if(10 == 10) { x = 10; } <br>
 else if(10 == 10) {x = 15} <br>
 => Burada if koşulunun içerisindeki koşul sağlandığı için else if koşulu sağlansa bile else if kodu çalışmayacaktır. <br>
 if(5 == 10) { x = 10; } <br>
 else if(10 == 10) {x = 15} <br>
 => Burada if koşulunun içerisindeki koşul sağlanmadığı için ve else if koşulu sağlandığı için else if içerisindeki kod çalıştırılacak ve x değeri 15 olarak değiştirilecektir.

### else koşulu 
=> Eğer öncesindeki hiçbir koşul sağlanmadıysa herhangi bir koşulu kontrol etmeksizin içerisindeki kodu çalıştıracaktır. <br>
if(5 == 10) {x = 10} <br>
else {x = 15} <br>
=> Burada if koşulu sağlanmadığı için ve başka koşul kalmadığı için else kodu devreye girip x değeri 15 olarak atanacaktır.

### Koşula bağlı operatör
"?:" (Ternary Operator)/(Koşula Bağlı Operatör) => bu operatör mantığı if else den gelmektedir. x ? y : z şeklinde kullanılan bu operatör de x in istenilen koşul, koşul sağlanırsa dönecek veri y, koşul sağlanmazsa dönecek veri z dir.

x > 0 ? x : -x <br>
=> Bu kodda bir x değeri isteniyor ve bu x değerinin koşulu "x > 0" dur, eğer x değişkeni 0 dan büyükse x in kendisi çıktı olacaktır fakat x değişkeni 0 dan küçükse - ile çarpılıp yani -x değeri çıktımız olacaktır.


## Switch Case koşulu
=> Uzun uzun if else ler kullanmak yerine bunu tercih etmeniz hem kod okunabilirliği hem de performansı olumlu yönde etkileyecektir. <br>
int i = 3 // i ye 3 değerini verdik ve veri tipini int yani tam sayı olarak belirledik. <br>
switch(i){ <br>
        case 1: // eğer değer 1 ise yapılacakları belirliyoruz. <br>
                System.out.println("i değeri 1 dir."); // bu method ile tırnaklar arasındaki veriyi konsola yazdıracağız yani eğer i değerimiz 1 olsaydı konsolda "i değeri 1 dir." yazısı çıkacaktı. <br>
                break; // bu ifade koşuldan çıkmamızı sağlayacaktır. Eğer bu ifadeyi kullanmazsanız tüm case yapılarının çıktısını verecektir ve kodumuz istediğmiz şekilde çalışmayacaktır. <br>
        case 2: <br>
                System.out.println("i değeri 2 dir."); <br>
                break; <br>
        case 3: // x değerimiz 3 olduğu için bu kısımdaki kod çalışacaktır. <br>
                System.out.print.ln("i değeri 3 tür."); // kodumuzu çalıştırdığımızda konsolumuzda "i değeri 3 tür." yazısını göreceğiz. <br>
                break;  <br>
}


## Static
=> static ile oluşturulan bir metot ortaktır ve class ın new lanmasını gerektirmez


#Spring Web
@Service -> bussines layer annotation
@Repository -> data access layer annotation
