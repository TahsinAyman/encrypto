package com.fullstackbd.tahsin.backend.repository;

import com.fullstackbd.tahsin.backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}