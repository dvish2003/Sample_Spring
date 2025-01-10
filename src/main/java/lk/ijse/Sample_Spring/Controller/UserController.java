package lk.ijse.Sample_Spring.Controller;

import lk.ijse.Sample_Spring.dto.UserDto;
import lk.ijse.Sample_Spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: vishmee
 * Date: 1/9/25
 * Time: 10:29 AM
 * Description:
 */
@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDto> getUser(){
        return userService.getUsers();
    }

    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto  userDto ){
        return userService.saveUser(userDto);
    }

    @PutMapping("/updateUser")
    public  UserDto updateUser(@RequestBody UserDto  userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDto userDto){
       return userService.deleteUser(userDto);
    }

    @GetMapping("/getUserById/{userID}")
    public UserDto getUserById(@PathVariable String userID){
        return userService.getUserById(userID);
    }
}
