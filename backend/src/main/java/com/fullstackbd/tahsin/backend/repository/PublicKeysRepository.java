package com.fullstackbd.tahsin.backend.repository;

import com.fullstackbd.tahsin.backend.entity.PublicKeys;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicKeysRepository extends JpaRepository<PublicKeys, Long> {
}