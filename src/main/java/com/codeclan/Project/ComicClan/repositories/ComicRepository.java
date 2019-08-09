package com.codeclan.Project.ComicClan.repositories;

import com.codeclan.Project.ComicClan.models.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Long>, ComicRepositoryCustom {
}
