package com.quitapp.user.mappers;

import com.quitapp.user.entities.User;
import com.quitapp.user.payloads.requests.RegisterUserPayload;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-08T16:19:24+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User fromPayloadToEntity(RegisterUserPayload payload) {
        if ( payload == null ) {
            return null;
        }

        User user = new User();

        user.setMainCharacterName( payload.getMainCharacterName() );
        user.setUsername( payload.getUsername() );
        user.setClientId( payload.getClientId() );
        user.setClientSecret( payload.getClientSecret() );
        user.setAccessToken( payload.getAccessToken() );

        return user;
    }
}
