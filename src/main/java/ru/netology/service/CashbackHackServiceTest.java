package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
  
    int actual = service.remain(amount);
    int expected = 13; 
  Assert.assertEquals(expected, service.remain(amount:987);
    }
}
