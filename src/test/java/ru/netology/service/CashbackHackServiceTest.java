package ru.netology.service;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class CashbackHackServiceTest extends TestCase {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldProposeOne() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldProposeFiveHundred() {
        assertEquals(500, service.remain(1500));
    }

    @Test
    public void shouldProposeNull() {
        assertNull(service.remain(2000));
    }
}