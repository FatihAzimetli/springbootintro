package com.tpe.repository;

import com.tpe.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.RelationServiceNotRegisteredException;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUserName(String usrName) throws RelationServiceNotRegisteredException;
}
