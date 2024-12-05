package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();

   CashbackHackService.getserviceremaim(13)
    
    int expected = 13;
    int amount = service.remain(); 
  Assert.assertEquals(expected, service.remain(887));
    }
}
