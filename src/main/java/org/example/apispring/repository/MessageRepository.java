package org.example.apispring.repository;

import org.example.apispring.model.Message;
import org.example.apispring.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository  extends JpaRepository<Message, Integer> {

}
