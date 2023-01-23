package com.fullstackbd.tahsin.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "public_keys_id", unique = true)
    private PublicKeys publicKeys;
    @OneToOne
    @JoinColumn(name = "private_keys_id", unique = true)
    private PrivateKeys privateKeys;
}
