package org.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "buddyinfo", path = "buddyinfo")
public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, String> {
    List<BuddyInfo> findByName(String name);

    // BuddyInfo findByID(long id);
}
