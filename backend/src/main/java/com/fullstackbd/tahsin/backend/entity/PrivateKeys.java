package com.fullstackbd.tahsin.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "private_keys")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrivateKeys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "private_key", nullable = false, unique = true)
    private String privateKey;
}