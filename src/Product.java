public class Product
{
    public String name;
    public double price;
    private String description;

    public Product(String name,double price,String description)
    {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void print_price()
    {
        System.out.println("Price" + price);
    }
    public void print_name()
    {
        System.out.println("Name" + name);
    }

    //

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    //

    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
