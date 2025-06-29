CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_name IN VARCHAR2,
  bonus_pct IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_pct / 100)
  WHERE Department = dept_name;
  
  COMMIT;
END;
/

EXEC UpdateEmployeeBonus('Sales', 10);
SELECT * FROM Employees;

