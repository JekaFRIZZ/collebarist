package com.example.collebarist.repository;

import com.example.collebarist.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Interface refers Create, Delete, Update, Read
 */
public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findMessagesByTag(String tag);
}
