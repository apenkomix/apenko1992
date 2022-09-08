package org.example.javaspring.homework_24.converter;

import org.example.javaspring.homework_24.dto.AddressDto;
import org.example.javaspring.homework_24.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {
    public AddressDto toFront(Address address) {
        if (address == null) {
            return null;
        }
        return new AddressDto(address.getId(), address.getCity(), address.getStreet(), address.getNumber());
    }
    public Address toLocal(AddressDto addressDto){
        if (addressDto == null){
            return null;
        }
        Address address = new Address();
        address.setId(addressDto.id());
        address.setCity(addressDto.city());
        address.setStreet(addressDto.street());
        address.setNumber(addressDto.number());

        return address;
    }
}
