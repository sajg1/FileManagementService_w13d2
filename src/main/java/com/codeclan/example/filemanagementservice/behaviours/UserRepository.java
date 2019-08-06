package com.codeclan.example.filemanagementservice.behaviours;

import com.codeclan.example.filemanagementservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
