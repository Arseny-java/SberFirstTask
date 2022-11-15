package ru.sber.model.products.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-������������ ��������� �����")
class CreditCardTest {
    CreditCard creditCard;

    @BeforeEach
    public void createCreditCard() {
        creditCard = new CreditCard("Arseny", "RUR", 1000., 12.3, 150000.);
    }


    @Test
    @DisplayName("�������� ������������� �� ��������� �����")
    void getDebt() {
        Double expected = 167327.;
        Double actual = creditCard.getDebt();
        assertEquals(expected, actual, "������������� �� �������");
    }

    @Test
    @DisplayName("�������� ������� ��������� �����")
    void getBalanceInfo() {
        Double expected = 1000.;
        Double actual = creditCard.getBalanceInfo();
        assertEquals(expected, actual, "������ �� ������");
    }

    @Test
    @DisplayName("���������� ������� ��������� �����")
    void increaseBalance() {
        Double amount = 1000.;
        Double expected = 2000.;
        creditCard.increaseBalance(amount);
        Double actual = creditCard.getBalanceInfo();
        assertEquals(expected, actual, "������ �� ��������");
    }

    @Test
    @DisplayName("�������� � ������� ��������� �����")
    void writeOffBalance() {
        Double amount = 500.;
        Double expected = 500.;
        creditCard.writeOffBalance(amount);
        Double actual = creditCard.getBalanceInfo();
        assertEquals(expected, actual, "������ �� ��������");
    }
}