package me.mni_js.springboot_blog.controller;

import lombok.RequiredArgsConstructor;
import me.mni_js.springboot_blog.dto.AddUserRequest;
import me.mni_js.springboot_blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request) {
        userService.save(request);
        return "redirect:/login"; // redirect: -> 회원가입이 끝나면 강제로 login 페이지로 리다이렉트.
    }
}
