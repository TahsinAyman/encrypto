package com.fullstackbd.tahsin.backend.repository;

import com.fullstackbd.tahsin.backend.entity.Encryptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncryptionsRepository extends JpaRepository<Encryptions, Long> {
}