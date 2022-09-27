public class Product {
    // Bir clas aynı zamanda attribute yani özellik barındırır.
    // attribute || fieldlar
    // constrauctorlar sınıf ile aynı isimde olurlar.



    //parametresiz constructor(yapıcı metot)
    public Product() {
       System.out.println("Yapıcı blok çalıştı");
    }


    //parametreli constructor.
    // parametreli constructor bize şunu diyor;
    // Product classını ben sana ancak constructorun içindeki değerleri verirsen kullandırırım diyor
    public Product(int id, String name, String description, double price, String renk, int stockAmount) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.renk = renk;
        this.stockAmount = stockAmount;
    }

    //hem parametreli hem de parametresiz constructor kullanırsak buna overloading denir
    //yani aşırı yüklenme;


    private int id;
    private String name;
    private String description;
    private double price;
    private String renk;
    private int stockAmount;
    private String kod;

    //Bu bloğa getter bloğu denir
    public int getId() {
        return id;

    }

    // Bu bloğa setter bloğu denir
    public void setId(int id) {
        this.id = id;
        // this benim içierisnde bulunduğum clas demek
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }
}
