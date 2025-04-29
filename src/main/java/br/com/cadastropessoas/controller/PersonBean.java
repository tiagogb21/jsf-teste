package br.com.cadastropessoas.controller;

import br.com.cadastropessoas.model.Person;
import br.com.cadastropessoas.service.PersonService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class PersonBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Person person;
    private List<Person> persons;

    @Inject
    private PersonService personService;

    @PostConstruct
    public void init() {
        person = new Person();
        persons = personService.findAllPersons();
    }

    public void save() {
        if (person.getId() == null) {
            personService.savePerson(person);
        } else {
            personService.updatePerson(person);
        }
        persons = personService.findAllPersons();
        person = new Person();
    }

    public void edit(Person person) {
        this.person = person;
    }

    public void clear() {
        person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
