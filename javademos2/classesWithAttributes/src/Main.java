public class Main {

    public static void main(String[] args) {
        // bunları bu şekilde kullanacaksam Product sınıfında parametresiz constructor kullanmalıyım.
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setRenk("mavi");
//        product.setStockAmount(3);


        //bu şekilde kullanacaksam da Product sınıfında parametreli constructor kullanmalıyım
        //Yukarıda ki değerleri bu şekilde de parametreli constructor ile de kullanabiliriz.
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, "Siyah", 3);





        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}
