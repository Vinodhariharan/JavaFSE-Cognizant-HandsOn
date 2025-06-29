package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Alice", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount("Bob", 800);
        boolean result = account.withdraw(300);
        assertTrue(result);
        assertEquals(500, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawFailure() {
        BankAccount account = new BankAccount("Charlie", 200);
        boolean result = account.withdraw(300);
        assertFalse(result);
        assertEquals(200, account.getBalance(), 0.001);
    }
}
