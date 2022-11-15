package ru.sber.model.products.cards;

import ru.sber.interfaces.AddToStorageAfterCreating;
import ru.sber.interfaces.GetBalanceInfo;
import ru.sber.interfaces.IncreaseBalance;
import ru.sber.interfaces.Withdrawable;
import ru.sber.model.Product;

public class DebitCard extends Product implements AddToStorageAfterCreating, Withdrawable, IncreaseBalance, GetBalanceInfo {

    public DebitCard(String name, String currency, Double balance) {
        super(name, currency, balance);
        addToStorage(name);
    }

    public Double getBalanceInfo() {
        return GetBalanceInfo.super.getBalanceInfo(super.getOwnerName());
    }

    public void increaseBalance(Double amount) {
        IncreaseBalance.super.increaseBalance(super.getOwnerName(), amount);
    }

    public void writeOffBalance(Double amount) {
        Withdrawable.super.writeOffBalance(super.getOwnerName(), amount);
    }
}
