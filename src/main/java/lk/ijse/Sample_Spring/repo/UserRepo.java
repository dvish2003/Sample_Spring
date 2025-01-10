package lk.ijse.Sample_Spring.repo;

import lk.ijse.Sample_Spring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Author: vishmee
 * Date: 1/9/25
 * Time: 3:07 PM
 * Description:
 */
public interface UserRepo extends JpaRepository<User,Integer>{

    @Query(value = "Select * from User WHERE ID = ?1",nativeQuery = true)
    User getUserByUserID(String userID);

}
