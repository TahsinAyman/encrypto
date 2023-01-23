package com.fullstackbd.tahsin.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "encryptions")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Encryptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "encrypted_text", nullable = false)
    private String encryptedText;

    @ManyToOne
    @JoinColumn(name = "public_keys_id")
    private PublicKeys publicKeys;
}