package com.young.springboot.learn.firstapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.young.springboot.learn.firstapp.domain.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Student getStudent() {
		@SuppressWarnings("unchecked")
		List<Student> list = entityManager.createQuery("FROM Student")
				.setFirstResult(0)
				.setMaxResults(1)
				.getResultList();
		if (list.size()==0) {
			
			return null;
		}
		return list.get(0);
	}

}
