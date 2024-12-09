package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();

    int expected = 13;
    int actual = service.remain(987);
    
    assertEquals(expected, actual);
    }
}
