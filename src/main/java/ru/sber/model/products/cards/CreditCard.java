package ru.sber.model.products.cards;

import ru.sber.interfaces.*;
import ru.sber.model.Product;

@SuppressWarnings("FieldMayBeFinal")
public class CreditCard extends Product implements AddToStorageAfterCreating, Withdrawable,
        IncreaseBalance, GetBalanceInfo, GetDebt {

    private Double interestRate;
    private Double limit;

    public CreditCard(String name, String currency, Double balance, Double interestRate, Double limit) {
        super(name, currency, balance);
        this.interestRate = interestRate;
        this.limit = limit;
        addToStorage(name);
    }

    public Double getDebt() {
        return GetDebt.super.getDebt(super.getOwnerName(), limit, interestRate);
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
