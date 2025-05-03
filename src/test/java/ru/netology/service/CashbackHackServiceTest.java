package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void exactBoundary() {
        // amount = 1000 → остаток 0 (граница достигнута)
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void belowBoundary() {
        // Проверка суммы меньше границы (900 → не хватает 100)
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void aboveBoundary() {
        // Проверка суммы больше границы (1500 → не хватает 500 до 2000)
        assertEquals(service.remain(1500), 500);
    }

    @Test
    public void zeroAmount() {
        // Проверка нулевой суммы (0 → не хватает 1000)
        assertEquals(service.remain(0), 1000);
    }


}