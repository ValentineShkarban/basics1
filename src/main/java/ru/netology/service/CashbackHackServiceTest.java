package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
  @Test
  public void remainWhenLessThanBoundary() {
  CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(service.remain(987), 13);
  }
}
