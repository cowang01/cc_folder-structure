package com.codeclan.example.FolderStructure.repository;

import com.codeclan.example.FolderStructure.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
