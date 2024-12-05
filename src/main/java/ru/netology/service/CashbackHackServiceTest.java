package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
    int expected = 13;
    int actual = service.remain(); 
  Assert.assertEquals(expected, service.remain(887));
    }
}
