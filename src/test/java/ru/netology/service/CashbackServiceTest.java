package ru.netology.service;

public class CashbackServiceTest {

    @org.junit.Test
    public void testZeroAmount() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(0);
        org.junit.Assert.assertEquals(0,actual);
    }

    @org.junit.Test
    public void testPositiveAmountWithRemainder() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(999);
        org.junit.Assert.assertEquals(1, actual);
    }

    @org.junit.Test
    public void testPositiveAmountWithoutRemainder() {
        CashbackService cashbackService = new CashbackService();
        int actual = cashbackService.remain(6000);
        org.junit.Assert.assertEquals(0, actual);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testNegativeAmount() {
        CashbackService cashbackService = new CashbackService();
        cashbackService.remain(-3000);
    }

}