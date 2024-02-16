package onetoone.xml.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onetoone.xml.dao.PersonDao;
import onetoone.xml.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("onetoone.xml");
		Person person  = applicationContext.getBean("per", Person.class);
		PersonDao dao = applicationContext.getBean("dao", PersonDao.class);
//		dao.savePerson(person);
		dao.findPerson(1);
	}
}
