package com.example.gathergrid.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class UserDAO {
    @PersistenceContext
    private EntityManager entityManager;


}
