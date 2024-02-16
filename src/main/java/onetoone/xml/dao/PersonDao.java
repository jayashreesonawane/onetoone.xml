package onetoone.xml.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.xml.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shree");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void savePerson(Person person)
	{
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void findPerson(int id)
	{
		entityManager.find(Person.class, id);
		System.out.println();
	}
	
	public void updatePerson(int id, Person person)
	{
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}
}
