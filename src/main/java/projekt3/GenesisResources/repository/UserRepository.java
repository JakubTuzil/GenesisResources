package projekt3.GenesisResources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt3.GenesisResources.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
