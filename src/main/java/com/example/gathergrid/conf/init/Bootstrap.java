package com.example.gathergrid.conf.init;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Bootstrap {
    public static void initialise(){
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager entityManager = emf.createEntityManager();
            emf.close();
        }catch (Exception ignore){}
    }
}
