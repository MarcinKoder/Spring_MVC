package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.ProductDAO;
import pl.coderslab.objects.Cart;
import pl.coderslab.objects.CartItem;
import pl.coderslab.objects.Product;
import java.util.List;

@Controller
public class CartController {
    private ProductDAO productDAO;
    private Cart cart;

    @Autowired
    public CartController(Cart cart, ProductDAO productDAO) {
        this.cart = cart;
        this.productDAO = productDAO;
    }

    @GetMapping("/addtocart/{id}/{quantity}")
    @ResponseBody
    public String addtocart(@PathVariable int id, @PathVariable int quantity) {
        List<Product> products = productDAO.getList();
        List<CartItem> cartItems = cart.getCartItems();
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().getId() == id) {
                cartItem.setQuantity(quantity + cartItem.getQuantity());
                return "addtocart";
            }
        }
        Product newProduct = null;
        for (Product product : products){
            if (product.getId()==id){
                    newProduct=product;
                }
        }
        cart.addToCart(new CartItem(quantity, newProduct));
        return "addtocart";
    }

    @RequestMapping("/cart")
    public String carts(Model model) {
        model.addAttribute("carts", cart.getCartItems());
        model.addAttribute("cartSize",cart.count());
        model.addAttribute("quantity",cart.countProducts());
        model.addAttribute("sum",cart.countPrice());
        return "cart";
    }
}
