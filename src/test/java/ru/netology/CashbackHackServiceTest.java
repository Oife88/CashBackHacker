package ru.netology;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {


    @Test
    public void testRemain2() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = 100;
        int expected = service.remain(amount);
        assertEquals(actual,expected);

    }
    @Test
    public void testRemain3() {
        int amount = 2000;
        CashbackHackService service = new CashbackHackService();
        int actual = 0;
        int expected = service.remain(amount);
        assertEquals(actual,expected);

    }
    @Test
    public void testRemain() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = 0;
        int expected = service.remain(amount);
        assertEquals(actual,expected);

    }
}