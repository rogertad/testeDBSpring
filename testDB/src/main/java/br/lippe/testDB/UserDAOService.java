package br.lippe.testDB;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager em;
	
	public long insertUser(Usuario u) {
		
		em.persist(u);
		return u.getId();
		
	}
	
}
