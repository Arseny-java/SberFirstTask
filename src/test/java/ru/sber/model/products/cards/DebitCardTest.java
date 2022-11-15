package ru.sber.model.products.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-тестирование дебетовой карты карты")
class DebitCardTest {
    DebitCard DebitCard;

    @BeforeEach
    public void createCreditCard() {
        DebitCard = new DebitCard("Arseny", "RUR", 1000.);
    }


    @Test
    @DisplayName("Проверка баланса дебетовой карты")
    void getBalanceInfo() {
        Double expected = 1000.;
        Double actual = DebitCard.getBalanceInfo();
        assertEquals(expected, actual, "Баланс не совпал");
    }

    @Test
    @DisplayName("Пополнение баланса дебетовой карты")
    void increaseBalance() {
        Double amount = 1000.;
        Double expected = 2000.;
        DebitCard.increaseBalance(amount);
        Double actual = DebitCard.getBalanceInfo();
        assertEquals(expected, actual, "Баланс не пополнен");
    }

    @Test
    @DisplayName("Списание с баланса дебетовой карты")
    void writeOffBalance() {
        Double amount = 500.;
        Double expected = 500.;
        DebitCard.writeOffBalance(amount);
        Double actual = DebitCard.getBalanceInfo();
        assertEquals(expected, actual, "Баланс не уменьшен");
    }
}