package com.quitapp.user.repositories;

import com.quitapp.user.entities.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "role", collectionResourceRel = "role")
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
    Role findRoleByName(String name);
}
