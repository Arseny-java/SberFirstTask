package ru.sber;

import ru.sber.model.products.cards.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Arseny", "RUR", 1000., 12.3, 150000.);
        System.out.println(creditCard.getDebt());
        System.out.println(creditCard.getBalanceInfo());
        creditCard.increaseBalance(1000.);
        System.out.println(creditCard.getBalanceInfo());
        creditCard.writeOffBalance(500.);
        System.out.println(creditCard.getBalanceInfo());
    }
}

