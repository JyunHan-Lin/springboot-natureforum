package com.example.demo.controller;

import com.example.demo.model.entity.User;
import com.example.demo.model.entity.UserRole;
import com.example.demo.model.entity.Role;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRoleRepository;
import com.example.demo.repository.RoleRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/auth")
public class RegisterController {

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private UserRoleRepository userRoleRepository;
	
	@Autowired
    private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        // 檢查用戶名存在
        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("Username already exists");
        }

        // 建立使用者並加密密碼
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setEmail(request.getEmail());
        user.setGender(request.getGender());
        user.setBirthday(request.getBirthday());
        user.setVerify(false);
        user.setCreateTime(LocalDateTime.now());

        user = userRepository.save(user);

        // 取得預設角色
        Role role = roleRepository.findByName("ROLE_USER")
            .orElseThrow(() -> new RuntimeException("Default role not found"));

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        userRoleRepository.save(userRole);

        return ResponseEntity.ok("User registered successfully");
    }
}

@Data
class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private String gender;
    private java.time.LocalDate birthday;
}
