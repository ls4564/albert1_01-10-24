public class Main
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        Book book = new Book("The Catcher in the Rye", 30.0, "A classic novel");
        Electronics electronics = new Electronics("Smartphone", 999.99, "Latest model smartphone");
        Product clothing1 = new Clothing("T-shirt", 15.0, "Comfortable cotton t-shirt");
        if(book instanceof Product)
        {
            cart.add_to_cart(book);
        }
        if(electronics instanceof Product)
        {
            cart.add_to_cart(electronics);
        }
        if(clothing1 instanceof Product)
        {
            cart.add_to_cart(clothing1);
        }

        System.out.println(cart.calculateTotal());


    }
}