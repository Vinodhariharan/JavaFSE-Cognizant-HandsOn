package com.cognizant.ormlearn;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.cognizant.ormlearn.model.Employee;

public class HibernateMain {

    private static SessionFactory factory;

    public static void main(String[] args) {
        factory = new Configuration().configure().buildSessionFactory();

        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setDepartment("HR");

        Integer id = addEmployee(emp);
        System.out.println("Employee ID: " + id);

        factory.close();
    }

    public static Integer addEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}

