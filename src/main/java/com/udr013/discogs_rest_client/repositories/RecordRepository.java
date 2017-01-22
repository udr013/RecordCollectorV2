package com.udr013.discogs_rest_client.repositories;

import com.udr013.discogs_rest_client.entities.Record;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component //
public interface RecordRepository extends CrudRepository<Record, Long> {


	Collection<Record> findByArtistContainingIgnoreCaseAndIdusers(String name, long id);

	Collection<Record> getAllRecordsByIdusers(long id);
}
