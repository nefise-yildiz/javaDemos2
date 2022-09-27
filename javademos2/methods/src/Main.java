public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }
    //java da metot isimleri camel case yazılır.
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMı = false;
        for (int ara : sayilar) {
            if (ara == aranacak) {
                varMı = true;
                break;
            }
        }
//        if (varMı) {
//            mesajVer(aranacak);
//        } else {
//            System.out.println("Sayı Mevcut Değildir : "+aranacak);
//        }
//    }
//    // parametreli metot
//    public static void mesajVer (int aranacak) {
//        System.out.println("Sayı Mevcuttur : " + aranacak);
//    }
        String mesaj= " ";
        String mesaj2= " ";
        if (varMı){
            mesaj = "Sayı mevcuttur : "+ aranacak;
            mesajVer(mesaj);
        }else {
            mesaj2 = "Sayı mevcut değildir : " + aranacak;
            mesajVer(mesaj2);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}
