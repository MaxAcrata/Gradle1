
package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    // Новая реализация
    public int remain(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount == 0) {
            return boundary; // Явная обработка нуля
        }
        int remainder = amount % boundary;
        return remainder == 0 ? 0 : boundary - remainder;
    }
}