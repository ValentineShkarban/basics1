package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
    int expected = 13;
    int amount = service.remain(); 
  Assert.assertEquals(13, service.remain(887));
    }
}
