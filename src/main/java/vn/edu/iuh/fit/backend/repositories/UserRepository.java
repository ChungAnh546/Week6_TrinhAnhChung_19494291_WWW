package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByEmail(String email);
    boolean existsUserByMobile(String mobile);
    Optional<User> findUserByFirstName(String firstName);
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByMobile(String mobile);


}