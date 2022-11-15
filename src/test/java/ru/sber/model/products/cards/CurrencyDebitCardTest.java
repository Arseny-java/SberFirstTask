package ru.sber.model.products.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-������������ �������� ��������� ����� �����")
class CurrencyDebitCardTest {
    CurrencyDebitCard currencyDebitCard;

    @BeforeEach
    public void createCreditCard() {
        currencyDebitCard = new CurrencyDebitCard("Arseny", "RUR", 1000.);
    }


    @Test
    @DisplayName("�������� ������� �������� ��������� �����")
    void getBalanceInfo() {
        Double expected = 1000.;
        Double actual = currencyDebitCard.getBalanceInfo();
        assertEquals(expected, actual, "������ �� ������");
    }

    @Test
    @DisplayName("���������� ������� �������� ��������� �����")
    void increaseBalance() {
        Double amount = 1000.;
        Double expected = 2000.;
        currencyDebitCard.increaseBalance(amount);
        Double actual = currencyDebitCard.getBalanceInfo();
        assertEquals(expected, actual, "������ �� ��������");
    }

    @Test
    @DisplayName("�������� � ������� �������� ��������� �����")
    void writeOffBalance() {
        Double amount = 500.;
        Double expected = 500.;
        currencyDebitCard.writeOffBalance(amount);
        Double actual = currencyDebitCard.getBalanceInfo();
        assertEquals(expected, actual, "������ �� ��������");
    }
}