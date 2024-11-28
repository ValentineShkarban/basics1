package ru.netology.service;

import org.testng.Assert;
import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
  Assert.assertEquals(10, service.remain(990))
    }
}
