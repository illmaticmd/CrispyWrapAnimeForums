package com.fdmgroup.cwaf;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Component
public class JPAPostDAO implements PostDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("memberstorage");

	@Override
	public void addPost(Post post) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(post);

		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Post getPost(String title) {
		EntityManager em = emf.createEntityManager();

		TypedQuery<Post> query = em.createQuery("SELECT u FROM Post u WHERE title=?1", Post.class);
		query.setParameter(1, title);
		Post post;
		try {
			post = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		em.close();
		return post;
	}

	@Override
	public void removePost(String title) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.remove(em.find(Post.class, title));

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void updatePost(Post post) {
		EntityManager em = emf.createEntityManager();
		Post foundPost = em.find(Post.class, post.getPost_id());

		em.getTransaction().begin();

		foundPost.setTitle(post.getTitle());
		foundPost.setBody(post.getBody());

		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Post> listPost() {
		EntityManager em = emf.createEntityManager();

		TypedQuery<Post> query = em.createQuery("SELECT u FROM Posts u", Post.class);

		List<Post> posts = query.getResultList();

		em.close();
		return posts;
	}

}
