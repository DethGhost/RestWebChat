package org.ua.deth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ua.deth.entitys.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
