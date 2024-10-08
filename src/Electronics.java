public class Electronics extends Product
{
    private int bbb;
    public Electronics(String name, double price, String description,int bbb)
    {
        super(name, price, description);
        this.bbb = bbb;
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