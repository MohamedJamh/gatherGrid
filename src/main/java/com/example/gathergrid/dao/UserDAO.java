package com.example.gathergrid.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
@Transactional
public class UserDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    public void save(Object user) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.persist(user);
        entityManager.close();
    }
}
