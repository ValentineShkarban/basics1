package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void remainWhenLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 13;
        int actual = service.remain(987);

        assertEquals(actual, expected);
    }
}
