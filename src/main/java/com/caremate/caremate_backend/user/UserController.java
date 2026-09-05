package com.caremate.caremate_backend.user;

import com.caremate.caremate_backend.user.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        User savedUser = userService.register(request);
        return ResponseEntity.ok(savedUser);
    }
}