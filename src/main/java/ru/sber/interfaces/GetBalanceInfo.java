package ru.sber.interfaces;

import ru.sber.model.Product;
import ru.sber.storage.Storage;

public interface GetBalanceInfo {
    default Double getBalanceInfo(String ownerName) {
        Product product = Storage.getFromStorage(ownerName);
        return product.getBalance();
    }
}
