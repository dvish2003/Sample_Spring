package lk.ijse.Sample_Spring.Controller;

import lk.ijse.Sample_Spring.dto.UserDto;
import lk.ijse.Sample_Spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getUser")
    public  String getUser(){
        return "Simple User";
    }

    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto  userDto ){
        return userService.saveUser(userDto);
    }

    @PutMapping("/updateUser")
    public  String updateUser(){
        return "User Updated: ";
    }

    @DeleteMapping("/deleteUser")
    public  String deleteUser(){
        return "User Deleted: ";
    }
}
