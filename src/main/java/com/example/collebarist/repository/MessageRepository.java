package com.example.collebarist.repository;

import com.example.collebarist.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Interface refers Create, Read, Update, Delete
 */
public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findMessagesByTag(String tag);
}
