package br.com.cadastropessoas.service;

import java.util.List;

import br.com.cadastropessoas.model.Person;
import br.com.cadastropessoas.repository.PersonRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class PersonService {

    @Inject
    private PersonRepository personRepository;

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(Person person) {
        personRepository.update(person);
    }

    public Person findPersonById(Long id) {
        return personRepository.findById(id);
    }

    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }
}
