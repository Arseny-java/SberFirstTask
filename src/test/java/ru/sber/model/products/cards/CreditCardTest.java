package ru.sber.model.products.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-тестирование кредитной карты")
class CreditCardTest {
    CreditCard creditCard;

    @BeforeEach
    public void createCreditCard() {
        creditCard = new CreditCard("Arseny", "RUR", 1000., 12.3, 150000.);
    }


    @Test
    @DisplayName("Проверка задолженности по кредитной карте")
    void getDebt() {
        Double expected = 167327.;
        Double actual = creditCard.getDebt();
        assertEquals(expected, actual, "Задолженность не совпала");
    }

    @Test
    @DisplayName("Проверка баланса кредитной карты")
    void getBalanceInfo() {
        Double expected = 1000.;
        Double actual = creditCard.getBalanceInfo();
        assertEquals(expected, actual, "Баланс не совпал");
    }

    @Test
    @DisplayName("Пополнение баланса кредитной карты")
    void increaseBalance() {
        Double amount = 1000.;
        Double expected = 2000.;
        creditCard.increaseBalance(amount);
        Double actual = creditCard.getBalanceInfo();
        assertEquals(expected, actual, "Баланс не пополнен");
    }

    @Test
    @DisplayName("Списание с баланса кредитной карты")
    void writeOffBalance() {
        Double amount = 500.;
        Double expected = 500.;
        creditCard.writeOffBalance(amount);
        Double actual = creditCard.getBalanceInfo();
        assertEquals(expected, actual, "Баланс не уменьшен");
    }
}