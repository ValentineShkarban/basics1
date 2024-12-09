package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
    int amount = 1000;
  
    int actual = service.remain(amount: 987);
    int expected = 13; 
  Assert.assertEquals(expected: 13, service.remain(amount: 987));
    }
}
