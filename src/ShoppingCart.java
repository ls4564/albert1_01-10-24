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
/*
    public void add_to_cart(Product product)
    {
        boolean stop = false;
        int i = 0;
        while(i < 10 && !stop)
        {
            if(shoppingCart[i] == null)
            {
                shoppingCart[i] = (ShoppingCart) product;
                stop = true;
            }
            i++;
        }
    }

    public void calculateTotal()
    {
        double sum_price = 0;
        for(ShoppingCart s : shoppingCart)
        {
            sum_price = sum_price + s.getPrice();
        }
        System.out.println("The total calculation is: " + sum_price);
    }

*/

}
