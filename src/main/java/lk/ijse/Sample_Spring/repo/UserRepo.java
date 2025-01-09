package lk.ijse.Sample_Spring.repo;

import lk.ijse.Sample_Spring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: vishmee
 * Date: 1/9/25
 * Time: 3:07 PM
 * Description:
 */
public interface UserRepo extends JpaRepository<User,Integer>{
}
