public class Clothing extends Product
{
    private int aaa;
    public Clothing(String name, double price, String description,int aaa)
    {
        super(name,price,description);
        this.aaa = aaa;
    }

    @Override
    public void print_price()
    {
        System.out.println("Price" + super.getPrice());
    }

    @Override
    public void print_name()
    {
        System.out.println("Name" + super.getName());
    }

}