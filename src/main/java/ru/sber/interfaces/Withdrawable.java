package ru.sber.interfaces;

import ru.sber.model.Product;
import ru.sber.storage.Storage;

public interface Withdrawable {
    default void writeOffBalance(String ownerName, Double amount) {
        Product product = Storage.getFromStorage(ownerName);
        product.setBalance(product.getBalance() - amount);
    }
}
