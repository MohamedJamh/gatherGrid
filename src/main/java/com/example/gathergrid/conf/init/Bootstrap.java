package com.example.gathergrid.conf.init;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

@Transactional
public class Bootstrap {
    public static void initialise(){
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            emf.close();
        }catch (Exception ignore){}
    }
}
