package com.quitapp.user.mappers;

import com.quitapp.user.entities.User;
import com.quitapp.user.payloads.requests.RegisterUserPayload;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper instance = Mappers.getMapper(UserMapper.class);

    User fromPayloadToEntity(RegisterUserPayload payload);
}
