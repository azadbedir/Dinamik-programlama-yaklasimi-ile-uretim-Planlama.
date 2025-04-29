JobScheduling - Minimum Toplam Süre Hesaplama
Açıklama
Bu proje, ardışık olarak yapılması gereken n adet işin, m adet farklı makineler üzerinde gerçekleştirilmesi durumunda, toplam işlem süresini minimum yapacak şekilde en uygun iş-makine sıralamasını hesaplar.

Her iş farklı makinelerde farklı sürelerde tamamlanabilir ve bir işten diğerine geçerken makine değiştirmenin bir geçiş maliyeti olabilir.

Kodda dinamik programlama kullanılarak optimal toplam süre hesaplanır.

Giriş Verileri
n: Yapılacak iş sayısı.

m: Kullanılabilecek makine sayısı.

processingTime[n][m]: Her işin her makinede tamamlanma süresini belirtir.

transitionCost[m][m]: Bir makineden diğerine geçişte oluşan maliyet/süre.

Kullanım
JobScheduling sınıfı içerisinde minTotalTime fonksiyonu çağrılarak minimum toplam süre elde edilir.

Örnek:
java
Kopyala
Düzenle
int n = 3; 
int m = 2;

int[][] processingTime = {
    {4, 6},
    {5, 3},
    {8, 7}
};

int[][] transitionCost = {
    {0, 2},
    {2, 0}
};

int result = minTotalTime(n, m, processingTime, transitionCost);
System.out.println("Minimum toplam sure: " + result);
Çıktı:
yaml
Kopyala
Düzenle
Minimum toplam sure: 16
Algoritma Açıklaması
İlk iş için her makinedeki işlem süresi doğrudan dp dizisine yazılır.

Daha sonraki işler için, bir önceki işin tamamlandığı tüm makinelerden geçiş maliyeti hesaplanarak minimum toplam süre bulunur.

Son işin her makinedeki bitiş sürelerinden en küçük olanı sonuç olarak döndürülür.

Derleme ve Çalıştırma
bash
Kopyala
Düzenle
javac JobScheduling.java
java JobScheduling
Lisans
Bu proje herhangi bir lisans altında değildir. Kişisel ve eğitim amaçlı serbestçe kullanılabilir.
