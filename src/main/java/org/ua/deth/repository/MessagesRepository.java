package org.ua.deth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ua.deth.entitys.Messages;

public interface MessagesRepository extends JpaRepository<Messages, Long> {
}
