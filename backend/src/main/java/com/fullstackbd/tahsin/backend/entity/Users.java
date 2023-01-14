package com.fullstackbd.tahsin.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @Column(nullable = false, name = "username", unique = true)
    private String username;
    @Column(nullable = false, name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "public_keys_id")
    private PublicKeys publicKeys;
    @OneToMany(mappedBy = "id", fetch = FetchType.EAGER)
    private List<Encryptions> encryptions;
}