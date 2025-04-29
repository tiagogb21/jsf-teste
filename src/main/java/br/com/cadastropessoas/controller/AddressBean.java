package br.com.cadastropessoas.controller;

import java.io.Serializable;
import java.util.List;

import br.com.cadastropessoas.model.Address;
import br.com.cadastropessoas.service.AddressService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ViewScoped
public class AddressBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Address address;
    private List<Address> addresses;

    @Inject
    private AddressService addressService;

    @PostConstruct
    public void init() {
        address = new Address();
        addresses = addressService.findAll();
    }

    public void save() {
        if (address.getId() == null) {
            addressService.save(address);
        } else {
            addressService.update(address);
        }
        addresses = addressService.findAll();
        address = new Address();
    }

    public void edit(Address address) {
        this.address = address;
    }

    public void clear() {
        address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
