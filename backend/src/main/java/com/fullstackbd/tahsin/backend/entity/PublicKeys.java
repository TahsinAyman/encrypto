package com.fullstackbd.tahsin.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "public_keys")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublicKeys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "public_key", nullable = false, unique = true)
    private String publicKey;

}