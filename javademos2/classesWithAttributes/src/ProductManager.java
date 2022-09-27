public class ProductManager {
    public void Add(Product product){
        // Daha sonra JDBC kodlarıyla veri tabanına yazıcaz.
        System.out.println("Ürün eklendi : " + product.getName());
    }

    public void Add2(int id, String name, String description, int stockAmount,double price,String renk){
    }
}
