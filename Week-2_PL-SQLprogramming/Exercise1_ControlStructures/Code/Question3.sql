DECLARE
  v_due_date DATE;
BEGIN
  FOR loan_rec IN (
    SELECT c.CustomerID, c.Name, l.LoanID, l.DueDate
    FROM Customers c
    JOIN Loans l ON c.CustomerID = l.CustomerID
    WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan_rec.Name ||
                         ' (ID: ' || loan_rec.CustomerID || ') has a loan (ID: ' || loan_rec.LoanID || 
                         ') due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/
