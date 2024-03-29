package com.codeclan.example.FolderStructure.repository;

import com.codeclan.example.FolderStructure.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
