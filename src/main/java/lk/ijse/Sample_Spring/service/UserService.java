package lk.ijse.Sample_Spring.service;

import jakarta.transaction.Transactional;
import lk.ijse.Sample_Spring.Entity.User;
import lk.ijse.Sample_Spring.dto.UserDto;
import lk.ijse.Sample_Spring.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Character.getType;

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
    //Model mapper eken wenne user dto ek Entity widiht harawima ha entity ek DTO widiht harawima

    public UserDto saveUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
         return userDto;
    }
    public UserDto updateUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
         return userDto;
    }
    public boolean deleteUser(UserDto userDto){
        userRepo.delete(modelMapper.map(userDto, User.class));
         return true;
    }

    public List<UserDto> getUsers(){
        List <User> userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDto>>(){}.getType());
    }

    //user id > user Details
    public UserDto getUserById(String userID){
       User user = userRepo.getUserByUserID(userID);
       // pahatha kara atte entity ek dto widiht convert kirimai
       return modelMapper.map(user,UserDto.class);
    }
    //user id > user Address
}
