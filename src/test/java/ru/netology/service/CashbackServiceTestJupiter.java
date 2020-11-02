package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackServiceTestJupiter {

    @Test
    public void testZeroAmount() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(0);
        assertEquals(0,actual);
    }

    @Test
    public void testPositiveAmountWithRemainder() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(999);
        assertEquals(1, actual);
    }

    @Test
    public void testPositiveAmountWithoutRemainder() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(6000);
        assertEquals(0, actual);
    }

    @Test
    public void testNegativeAmount() {
        CashbackService cashbackService = new CashbackService();
        assertThrows(IllegalArgumentException.class, () -> cashbackService.remain(-3000));
    }

}