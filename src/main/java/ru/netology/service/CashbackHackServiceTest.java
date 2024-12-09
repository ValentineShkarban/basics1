package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();

    int actual = service.remain(987);
    int expected = 13; 
  Assert.assertEquals(expected, actual);
    }
}
