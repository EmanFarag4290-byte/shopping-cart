// Item Class
class Item {
    String name;
    double price;
    int quantity;
    

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    
    }
}

// ShoppingCart Class
class ShoppingCart {
    Item[] cart; // Array to store items
    int count = 0; // Number of items added
    double totalPrice = 0; // Total price of all items

    public ShoppingCart(int capacity) {
        cart = new Item[capacity];
    }

    public void addToCart(Item item) {
        if (count < cart.length) {
            cart[count] = item;
            totalPrice += item.price * item.quantity;
            count++;
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < count; i++) {
            System.out.println(cart[i].name + " - Quantity: " + cart[i].quantity + ", Price: " + cart[i].price);
        }
        System.out.println("Total Price: " + totalPrice);
    }
}

// Main Class
public class MainShoppingCart {
    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart(3);

        cart.addToCart(new Item("Pen", 5, 2 ));
        cart.addToCart(new Item("Notebook", 5.0, 1));
        cart.addToCart(new Item("Eraser", 3, 5));

        cart.displayCart();
    }
}