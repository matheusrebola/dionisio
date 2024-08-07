package dionisio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, UUID>{

}
