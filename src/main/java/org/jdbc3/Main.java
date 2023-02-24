package org.jdbc3;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jdbc3.exercise_4.Animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.setId(1);
        animal.setName("Juice");
        animal.setAge(5);
        animal.setTail(true);

        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();



    }
}