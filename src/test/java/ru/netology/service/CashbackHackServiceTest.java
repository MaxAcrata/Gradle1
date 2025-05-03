package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void ExactBoundary() {
        // Проверка, когда сумма равна границе (1000 → остаток 0)
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void BelowBoundary() {
        // Проверка суммы меньше границы (900 → не хватает 100)
        assertEquals(100, service.remain(900));
    }

    @Test
    public void AboveBoundary() {
        // Проверка суммы больше границы (1500 → не хватает 500 до 2000)
        assertEquals(500, service.remain(1500));
    }

    @Test
    public void ZeroAmount() {
        // Проверка нулевой суммы (0 → не хватает 1000)
        assertEquals(1000, service.remain(0));
    }

}