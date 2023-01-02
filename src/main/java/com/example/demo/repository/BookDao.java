package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Books;



@Repository
public class BookDao {

	@Autowired
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	public List<Books> getoneBook(Integer bookid) {
		return em.createNamedStoredProcedureQuery("thirdProcedure").setParameter("bookid", bookid).getResultList();
		
	}
}
