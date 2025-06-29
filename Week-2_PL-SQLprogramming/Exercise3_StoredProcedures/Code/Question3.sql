CREATE OR REPLACE PROCEDURE TransferFunds (
  source_account IN NUMBER,
  target_account IN NUMBER,
  amount         IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check source balance
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = source_account;

  IF v_balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;

  -- Perform transfer
  UPDATE Accounts
  SET Balance = Balance - amount
  WHERE AccountID = source_account;

  UPDATE Accounts
  SET Balance = Balance + amount
  WHERE AccountID = target_account;

  COMMIT;
END;
/

-- Transfer 1000 from Account 103 to Account 104
EXEC TransferFunds(103, 104, 1000);
SELECT * FROM Accounts;

