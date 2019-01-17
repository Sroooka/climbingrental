package pl.onsight.wypozyczalnia.service;

import pl.onsight.wypozyczalnia.model.Cart;
import pl.onsight.wypozyczalnia.model.entity.ProductEntity;

import java.util.List;

public interface CartService {
    void addProductToCart(Cart cart, ProductEntity product, int quantity);

    void addDateToCart(Cart cart, String dateFilter);

    void addDiscountToCart(Cart cart, double discount);

    List<ProductEntity> getListOfProductsInCart(Cart cart);

    void removeProductsFromCart(Cart cart);
}
