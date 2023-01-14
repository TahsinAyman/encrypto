package com.fullstackbd.tahsin.backend.repository;

import com.fullstackbd.tahsin.backend.entity.Encryptions;
import com.fullstackbd.tahsin.backend.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private EncryptionsRepository encryptionsRepository;

    @Test
    public void add() {
//        Encryptions encryptions = Encryptions.
//                builder().
//                id(1L).
//                encryptedText("Tahsin").
//                build();
//        encryptionsRepository.save(encryptions);
        Users users = Users.
                builder().
                id(1L).
                username("tahsin").
                password("skyout123").
                encryptions(encryptionsRepository.findAll()).
                build();
        usersRepository.save(users);
    }

    @Test
    public void testFetch() {
        System.out.println(usersRepository.findAll());
    }

}