package pl.onsight.wypozyczalnia.service;

import pl.onsight.wypozyczalnia.model.Cart;
import pl.onsight.wypozyczalnia.model.CountProducts;
import pl.onsight.wypozyczalnia.model.entity.ProductEntity;

import java.util.List;

public interface CartService {
    void addProductToCart(Cart cart, ProductEntity product, int quantity);

    void addDateToCart(Cart cart, String dateFilter);

    List<ProductEntity> getListOfProductsInCart(Cart cart);

    void removeProductsFromCart(Cart cart);

    void removeProductFromCart(Cart cart, ProductEntity product);

    void removeProductsOneTypeFromCart(Cart cart, ProductEntity product);

    List<CountProducts> getCountedProductsInCartWithAvailable(Cart cart);
}
