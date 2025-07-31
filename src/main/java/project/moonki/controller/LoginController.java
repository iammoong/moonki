package project.moonki.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.moonki.dto.muser.LoginRequestDto;
import project.moonki.dto.muser.SignupRequestDto;
import project.moonki.dto.muser.UserResponseDto;
import project.moonki.service.muser.MUserService;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class LoginController {

    private final MUserService mUserService;

    @PostMapping("/signup")
    public ResponseEntity<UserResponseDto> signup(@RequestBody SignupRequestDto req) {
        return ResponseEntity.ok(mUserService.signup(req));
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponseDto> login(@RequestBody LoginRequestDto req) {
        return ResponseEntity.ok(mUserService.login(req));
    }
}
