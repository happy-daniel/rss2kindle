package tech.hanting.rss2kindle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.hanting.rss2kindle.convertor.UserConvertor;
import tech.hanting.rss2kindle.service.UserService;
import tech.hanting.rss2kindle.service.dto.UserDTO;
import tech.hanting.rss2kindle.web.vo.UserVo;

/**
 * 用户Controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private UserConvertor userConvertor;


    @GetMapping(value = "/detail/{loginId}")

    public @ResponseBody
    UserVo detail(@PathVariable("loginId") String loginId) {
        UserDTO userDTO = userService.findByLoginId(loginId);
        return userConvertor.convertDTO2Vo(userDTO);
    }
}
