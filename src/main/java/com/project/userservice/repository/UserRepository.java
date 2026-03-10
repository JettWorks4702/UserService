package com.project.userservice.repository;

import com.project.userservice.entities.UserInfoDTO;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<UserInfoDTO, String>
{

    Optional<UserInfoDTO> findByUserId(String userId);

}