package lk.ijse.Sample_Spring.service;

import jakarta.transaction.Transactional;
import lk.ijse.Sample_Spring.Entity.User;
import lk.ijse.Sample_Spring.dto.UserDto;
import lk.ijse.Sample_Spring.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: vishmee
 * Date: 1/9/25
 * Time: 3:08 PM
 * Description:
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
         return userDto;
    }
}
