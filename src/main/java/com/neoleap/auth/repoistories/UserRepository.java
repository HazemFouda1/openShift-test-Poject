package com.neoleap.auth.repoistories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.neoleap.auth.models.User;

@RepositoryRestResource
interface UserRepository extends JpaRepository<User, Long> {
}
