package org.tomik.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tomik.project.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
