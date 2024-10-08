public class ShoppingCart
{

    private Product[] shoppingCart;
    private int index;

    public ShoppingCart()
    {
        shoppingCart = new Product[10];
        index = 0;
    }
    public void add_to_cart(Product p) {
        if (this.index <10) {
            shoppingCart[index] = p;
            index++;
        } else {
            System.out.println("Cart is full");
        }
    }
    public double calculateTotal()
    {
        double total_sum = 0;
        for(Product p : shoppingCart)
        {
            if(p != null)
            {
                total_sum = total_sum + p.getPrice();
            }
        }
        return total_sum;
    }

}
