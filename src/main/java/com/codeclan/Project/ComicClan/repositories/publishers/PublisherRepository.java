package com.codeclan.Project.ComicClan.repositories.publishers;

import com.codeclan.Project.ComicClan.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long>, PublisherRepositoryCustom  {
}
