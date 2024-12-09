package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
    int amount = 1000;

   CashbackHackService.setamount(13);
    
    int actual = service.calculateBonus(amount);
    int expected = 13; 
  Assert.assertEquals(expected, actual);
    }
}
