public class Main {

    // void operasyonlar emreder. Şu işleri yap der geri çağırmaz.
    // ekrana mesaj yazdırması bize bir sonuç döndürdüğü anlamına gelmiyor sadece bir iş yapıyor.

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(0,7);
        System.out.println(sayi);
        int toplam = topla2(1,2,3,4,5,6,7,8,9);
        System.out.println(toplam);
        // Burada substring bir şey oluşturdu ve bize onu sonuç olarak verdi.
        // Ama void bize sonuç oalrak hiçbir şey vermiyor sadece yap dediğimiz işi yapıyor.
    }
    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Silindi.");

    }
    public static void guncelle(){
        System.out.println("Güncellendi");

    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar) {
        // int... = variable argument
        // yani istediğim kadar parametreyi gönderebilirim demek. yani parametre olarak
        // bir dizi gönderiyormuş gibi
        // zaten arka tarafta bizim gönderdiğimiz parametreleri diziye çeviriyor

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Antalya";
    }
}
