package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    /* JUnit 4 */

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
        assertEquals(0, service.remain(2000));
    }

    /* JUnit 5 */

    @org.junit.jupiter.api.Test
    public void shouldProposeOneJ5() {
        org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void shouldProposeFiveHundredJ5() {
        org.junit.jupiter.api.Assertions.assertEquals(500, service.remain(1500));
    }

    @org.junit.jupiter.api.Test
    public void shouldProposeNullJ5() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(2000));
    }
}