package com.fdmgroup.cwaf;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPAMemberDAO implements MemberDAO {
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

		TypedQuery<Member> query = em.createQuery("SELECT u FROM Member u WHERE username=?1", Member.class);
		query.setParameter(1, username);
		Member user;
		try {
			user = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		// Member user = em.find(Member.class, username);
		em.close();
		return user;
	}

	@Override
	public void removeMember(String username) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.remove(em.find(Member.class, username));

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void updateMember(Member user) {
		EntityManager em = emf.createEntityManager();
		Member foundUser = em.find(Member.class, user.getUser_id());

		em.getTransaction().begin();

		foundUser.setUsername(user.getUsername());
		foundUser.setFirstName(user.getFirstName());
		foundUser.setLastName(user.getLastName());
		foundUser.setPassword(user.getPassword());
		foundUser.setEmail(user.getEmail());

		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Member> listMembers() {
		EntityManager em = emf.createEntityManager();

		TypedQuery<Member> query = em.createQuery("SELECT u FROM Members u", Member.class);

		List<Member> users = query.getResultList();

		em.close();
		return users;
	}

}
