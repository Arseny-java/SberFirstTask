package ru.sber.model.products;

import ru.sber.interfaces.*;
import ru.sber.model.Product;

public class Deposit extends Product implements AddToStorageAfterCreating, IncreaseBalance, GetBalanceInfo, Closable {
    public Deposit(String name, String currency, Double balance) {
        super(name, currency, balance);
    }

    public Double getBalanceInfo() {
        return GetBalanceInfo.super.getBalanceInfo(super.getOwnerName());
    }

    public void increaseBalance(Double amount) {
        IncreaseBalance.super.increaseBalance(super.getOwnerName(), amount);
    }

    public void closeDeposit() {
        Closable.super.closeDeposit(super.getOwnerName());
    }
}
