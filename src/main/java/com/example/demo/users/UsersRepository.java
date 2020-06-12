package com.example.demo.users;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("usersTransactionManager")
public interface UsersRepository extends JpaRepository<Users, Integer> {

}