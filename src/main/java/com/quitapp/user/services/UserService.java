package com.quitapp.user.services;

import com.quitapp.user.enums.RoleType;
import com.quitapp.user.entities.User;
import com.quitapp.user.mappers.UserMapper;
import com.quitapp.user.payloads.requests.RegisterUserPayload;
import com.quitapp.user.payloads.responses.MessageResponse;
import com.quitapp.user.repositories.RoleRepository;
import com.quitapp.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public ResponseEntity<MessageResponse> save(RegisterUserPayload payload) {
        if (userRepository.existsByUsername(payload.getUsername()) || userRepository.existsByMainCharacterName(payload.getMainCharacterName()))
            return new ResponseEntity<>(new MessageResponse("Nom d'utilisateur ou nom de personnage déjà utilisé."), HttpStatus.BAD_REQUEST);

        User user = UserMapper.instance.fromPayloadToEntity(payload);
        user.setRole(roleRepository.findRoleByName(RoleType.USER.toString()));
        userRepository.save(user);
        return new ResponseEntity<>(new MessageResponse("Vous êtes enregistré."), HttpStatus.CREATED);
    }
}
