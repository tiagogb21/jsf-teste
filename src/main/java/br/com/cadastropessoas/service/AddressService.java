package br.com.cadastropessoas.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.cadastropessoas.model.Address;
import br.com.cadastropessoas.repository.AddressRepository;
import jakarta.ejb.Stateless;

@Stateless
public class AddressService {

    @Inject
    private AddressRepository addressRepository;

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findById(Long id) {
        return addressRepository.findById(id);
    }

    @Transactional
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Transactional
    public Address update(Address address) {
        return addressRepository.update(address);
    }

    @Transactional
    public void delete(Long id) {
        addressRepository.delete(id);
    }
}

