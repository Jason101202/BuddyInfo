package org.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "addressBook", path = "addressBook")
public interface AddressBookRepo extends CrudRepository<AddressBook, Long> {
    AddressBook findById(long id);

    public List<AddressBook> findAll();

    AddressBook findByName(@Param("name") String name);
}
