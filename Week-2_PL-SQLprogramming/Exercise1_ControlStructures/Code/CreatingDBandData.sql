CREATE TABLE Customers (
  CustomerID   NUMBER PRIMARY KEY,
  Name         VARCHAR2(50),
  Age          NUMBER,
  Balance      NUMBER(10, 2),
  IsVIP        VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE Loans (
  LoanID       NUMBER PRIMARY KEY,
  CustomerID   NUMBER,
  InterestRate NUMBER(5, 2),
  DueDate      DATE,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers (CustomerID, Name, Age, Balance) VALUES (1, 'John Smith', 65, 12000);
INSERT INTO Customers (CustomerID, Name, Age, Balance) VALUES (2, 'Alice Brown', 45, 8500);
INSERT INTO Customers (CustomerID, Name, Age, Balance) VALUES (3, 'Michael Lee', 70, 15000);
INSERT INTO Customers (CustomerID, Name, Age, Balance) VALUES (4, 'Emma Davis', 30, 9500);
INSERT INTO Customers (CustomerID, Name, Age, Balance) VALUES (5, 'Robert King', 62, 4000);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (101, 1, 7.5, SYSDATE + 15);   
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (102, 2, 6.0, SYSDATE + 45);   
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (103, 3, 8.2, SYSDATE + 10);   
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (104, 4, 5.5, SYSDATE + 5);    
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (105, 5, 9.0, SYSDATE + 35);  

COMMIT;

