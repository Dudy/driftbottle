package de.pomis.driftbottle.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<MessageEntity, Long> {

    List<MessageEntity> findById(String id);

}
