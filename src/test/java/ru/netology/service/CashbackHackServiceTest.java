package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(600);

        assertEquals(actual,expected);

    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();

        int expected = 150;
        int actual = service.remain(850);

        assertEquals(actual,expected);

    }

    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();

        int expected = 600;
        int actual = service.remain(400);

        assertEquals(actual,expected);

    }


}