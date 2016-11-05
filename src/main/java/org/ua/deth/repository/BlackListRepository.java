package org.ua.deth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ua.deth.entitys.BlackList;

public interface BlackListRepository extends JpaRepository<BlackList, Long> {
}
