CREATE TABLE Accounts (
  AccountID   NUMBER PRIMARY KEY,
  CustomerID  NUMBER,
  AccountType VARCHAR2(20),
  Balance     NUMBER(10, 2)
);

CREATE TABLE Employees (
  EmployeeID    NUMBER PRIMARY KEY,
  Name          VARCHAR2(50),
  Department    VARCHAR2(30),
  Salary        NUMBER(10, 2)
);

INSERT INTO Accounts VALUES (101, 1, 'Savings', 5000);
INSERT INTO Accounts VALUES (102, 2, 'Current', 7000);
INSERT INTO Accounts VALUES (103, 3, 'Savings', 12000);
INSERT INTO Accounts VALUES (104, 4, 'Savings', 8000);

INSERT INTO Employees VALUES (1, 'John Smith', 'Sales', 5000);
INSERT INTO Employees VALUES (2, 'Alice Brown', 'IT', 6000);
INSERT INTO Employees VALUES (3, 'Michael Lee', 'Sales', 5500);
INSERT INTO Employees VALUES (4, 'Emma Davis', 'HR', 5200);

COMMIT;

SELECT * FROM Accounts;
SELECT * FROM Employees;