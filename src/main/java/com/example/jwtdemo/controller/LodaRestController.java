//package com.example.jwtdemo;
//
//import com.example.jwtdemo.payload.LoginRequest;
//import com.example.jwtdemo.payload.LoginResponse;
//import com.example.jwtdemo.payload.RandomStuff;
//import com.example.jwtdemo.user.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping("/api")
//public class LodaRestController {
//
//    @Autowired
//    UserService userService;
//
//    @PostMapping("/login")
//    public LoginResponse authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
//        // Trả về jwt cho người dùng.
//        String jwt = userService.authenticateUser(loginRequest);
//        return new LoginResponse(jwt);
//    }
//
//    // Api /api/random yêu cầu phải xác thực mới có thể request
//    @GetMapping("/random")
//    public RandomStuff randomStuff(){
//        return new RandomStuff("JWT Hợp lệ mới có thể thấy được message này");
//    }
//
//}
