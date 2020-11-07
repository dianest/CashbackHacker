package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest {

    @org.testng.annotations.Test
    public void testZeroAmount() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(0);
        org.testng.Assert.assertEquals(actual, 0);
    }

    @org.testng.annotations.Test
    public void testPositiveAmountWithRemainder() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(999);
        org.testng.Assert.assertEquals(actual, 1);
    }

    @org.testng.annotations.Test
    public void testPositiveAmountWithoutRemainder() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(6000);
        org.testng.Assert.assertEquals(actual, 0);
    }

    @org.testng.annotations.Test(expectedExceptions = { IllegalArgumentException.class })
    public void testNegativeAmount() {
        CashbackService cashbackService = new CashbackService();
        cashbackService.remain(-3000);
    }

}