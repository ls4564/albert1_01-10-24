public class Book extends Product
{
    public Book(String name, double price, String description)
    {
        super(name, price, description);
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
