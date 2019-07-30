package com.codeclan.example.FolderStructure.repository;

import com.codeclan.example.FolderStructure.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
