package com.ccr.wapr.server.user.controller;

import com.ccr.wapr.api.dto.UserDTO;
import com.ccr.wapr.server.user.model.UserDO;
import com.ccr.wapr.server.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ccr12312@163.com at 2019-4-26
 */
@RestController
@Api(tags = "用户接口", description = "提供用户相关的 Rest API")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/users")
    @ApiOperation("新增用户")
    UserDTO newUser(@RequestBody UserDTO user) {
        UserDO saved = userService.save(asUserDO(user));
        return asUserDTO(saved);
    }

    @GetMapping("/users")
    @ApiOperation("所有用户")
    List<UserDTO> all() {
        List<UserDO> users = userService.findAll();
        return users.stream().map(this::asUserDTO).collect(Collectors.toList());
    }

    @DeleteMapping("/users/{id}")
    @ApiIgnore
    void delete(@PathVariable String id) {
        userService.deleteById(id);
    }

    private UserDTO asUserDTO(UserDO userDO) {
        return modelMapper.map(userDO,UserDTO.class);
    }

    private UserDO asUserDO(UserDTO userDTO) {
        return modelMapper.map(userDTO,UserDO.class);
    }
}
