package ru.sber.interfaces;

import ru.sber.model.Product;
import ru.sber.storage.Storage;

public interface IncreaseBalance {
    default void increaseBalance(String ownerName, Double amount) {
        Product product = Storage.getFromStorage(ownerName);
        product.setBalance(product.getBalance() + amount);
    }
}
