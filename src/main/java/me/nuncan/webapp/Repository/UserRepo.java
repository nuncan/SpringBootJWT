package me.nuncan.webapp.Repository;

import me.nuncan.webapp.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Repository;

@Eager
@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    User findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail1);
}
