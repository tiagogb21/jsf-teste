package br.com.cadastropessoas.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import br.com.cadastropessoas.model.Person;

@ApplicationScoped
public class PersonRepository {

    @PersistenceContext(unitName = "defaultPU")
    private EntityManager em;

    @Transactional
    public void save(Person person) {
        em.persist(person);
    }

    public Person update(Person person) {
        return em.merge(person);
    }

    public List<Person> findAll() {
        return em.createQuery("FROM Person", Person.class).getResultList();
    }

    public Person findById(Long id) {
        return em.find(Person.class, id);
    }
}
