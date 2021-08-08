package com.quitapp.user.repositories;

import com.quitapp.user.entities.Badge;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "badge", collectionResourceRel = "badge")
public interface BadgeRepository extends PagingAndSortingRepository<Badge, Long> {
}
