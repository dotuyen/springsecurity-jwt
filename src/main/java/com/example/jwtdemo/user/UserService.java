package com.example.jwtdemo.user;

import com.example.jwtdemo.jwt.JwtTokenProvider;
import com.example.jwtdemo.payload.LoginRequest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @Override
    public UserDetails loadUserByUsername(String username) {
        // Kiểm tra xem user có tồn tại trong database không?
        User u = new User();
        if ("loda".equals(username)) {
            u = new User();
            u.setUsername("loda");
            u.setPassword("loda");
        }
//        User user = userRepository.findByUsername(username);
        if (u == null) {
            throw new UsernameNotFoundException(username);
        }
//        return new CustomUserDetails(u);
        return null;
    }

    public UserDetails loadUserById(Long userId) {
        User u = new User();
        if (userId.equals(1L)) {
            u = new User();
            u.setUsername("loda");
            u.setPassword(passwordEncoder.encode("loda"));
//            return new CustomUserDetails(u);
            return null;
        }

//        Optional<User> user = userRepository.findById(userId);
//        if (user.isPresent())
        return null;
    }

    public String authenticateUser(LoginRequest loginRequest) {
        // Xác thực từ username và password.
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        // Nếu không xảy ra exception tức là thông tin hợp lệ
        // Set thông tin authentication vào Security Context
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails =(UserDetails) authentication.getPrincipal();
        User domainUser = new User();
        domainUser.setUsername(userDetails.getUsername());
        domainUser.setId(1L);

        CustomUserDetails customUserDetails = new CustomUserDetails(domainUser, (Set<GrantedAuthority>) userDetails.getAuthorities());
        return tokenProvider.generateToken(customUserDetails);

//        return new String();
    }
}
