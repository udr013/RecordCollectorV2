package com.udr013.discogs_rest_client.repositories;


import com.udr013.discogs_rest_client.entities.CdbUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<CdbUser, Long> {

    CdbUser findByUsername(String name);
    CdbUser findByEmail(String email);
}
