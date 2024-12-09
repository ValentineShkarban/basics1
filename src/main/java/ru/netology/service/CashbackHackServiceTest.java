package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
    int amount = 987;
  
    int actual = service.remain(amount);
    int expected = 13; 
  Assert.assertEquals(expected: 987, service.remain(amount: 987));
    }
}
