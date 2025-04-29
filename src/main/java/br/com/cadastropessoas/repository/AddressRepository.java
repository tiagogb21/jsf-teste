package br.com.cadastropessoas.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import br.com.cadastropessoas.model.Address;

@ApplicationScoped
public class AddressRepository {
    @PersistenceContext(unitName = "defaultPU")
    private EntityManager entityManager;

    public List<Address> findAll() {
        return entityManager.createQuery("SELECT a FROM Address a", Address.class).getResultList();
    }

    public Address findById(Long id) {
        return entityManager.find(Address.class, id);
    }

    public Address save(Address address) {
        entityManager.persist(address);
        return address;
    }

    public Address update(Address address) {
        entityManager.merge(address);
        return address;
    }

    public void delete(Long id) {
        Address address = findById(id);
        if (address != null) {
            entityManager.remove(address);
        }
    }
}
