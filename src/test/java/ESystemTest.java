import static org.junit.jupiter.api.Assertions.*;

import org.example.Cart;
import org.example.ESystem;
import org.example.Order;
import org.example.Product;
import org.junit.jupiter.api.Test;

public class ESystemTest {

    @Test
    public void testAddAndRemoveProductFromCart() {
        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 15.0);
        Cart cart = new Cart();

        cart.addProduct(product1);
        cart.addProduct(product2);

        assertEquals(2, cart.getProducts().size());

        cart.removeProduct(product1);
        assertEquals(1, cart.getProducts().size());
        assertEquals(product2, cart.getProducts().get(0));
    }

    @Test
    public void testPlaceOrder() {
        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 15.0);
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        ESystem system = new ESystem();
        Order order = system.placeOrder(cart);

        assertEquals(1, order.getOrderId());
        assertEquals(0, cart.getProducts().size());
    }

    @Test
    public void testGetOrderStatus() {
        Product product1 = new Product(1, "Product 1", 10.0);
        Cart cart = new Cart();
        cart.addProduct(product1);

        ESystem system = new ESystem();
        Order order = system.placeOrder(cart);

        assertEquals("В обробці", order.getStatus());

        order.setStatus("Відправлено");
        assertEquals("Відправлено", order.getStatus());
    }
}