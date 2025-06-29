package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("Alice", 1000.0);
        System.out.println("Account setup complete");
    }

    @After
    public void tearDown() {
        account.closeAccount();
        System.out.println("Account closed");
    }

    @Test
    public void testDeposit() {
        // Arrange
        double depositAmount = 500.0;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSuccess() {
        // Arrange
        double withdrawAmount = 400.0;

        // Act
        boolean result = account.withdraw(withdrawAmount);

        // Assert
        assertTrue(result);
        assertEquals(600.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawFailInsufficientFunds() {
        // Arrange
        double withdrawAmount = 1500.0;

        // Act
        boolean result = account.withdraw(withdrawAmount);

        // Assert
        assertFalse(result);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }
}
