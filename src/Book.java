public class Book extends Product
{
    private int ddd;
    public Book(String name, double price, String description,int ddd)
    {
        super(name, price, description);
        this.ddd = ddd;
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
