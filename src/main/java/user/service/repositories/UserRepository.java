package user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user.service.models.User;


@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
