package com.codeclan.Project.ComicClan.repositories.users;

import com.codeclan.Project.ComicClan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}
