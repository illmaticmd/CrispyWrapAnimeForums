package com.fdmgroup.cwaf;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUserDAO implements MemberDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("memberstorage");

	@Override
	public void addMember(Member user) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(user);
		
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public Member getMember(String username) {
		EntityManager em = emf.createEntityManager();
		return null;
	}

	@Override
	public void removeMember(String username) {
		EntityManager em = emf.createEntityManager();

	}

	@Override
	public void updateMember(Member user) {
		EntityManager em = emf.createEntityManager();
	}

	@Override
	public List<Member> listMembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
