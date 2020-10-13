package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest{
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldProposeOne() {
        assertEquals(service.remain(999),1);
    }

    @Test
    public void shouldProposeFiveHundred() {
        assertEquals(service.remain(1500),500);
    }

    @Test
    public void shouldProposeNull() {
        assertEquals(service.remain(2000), 0);
    }
}