package com.quitapp.user.repositories;

import com.quitapp.user.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByMainCharacterName(String mainCharacterName);

    User findUserByUsername(String username);
}
