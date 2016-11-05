package org.ua.deth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ua.deth.entitys.ChatUser;

public interface ChatUserRepository extends JpaRepository<ChatUser, Long>{
}
