package com.quitapp.user.payloads.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RegisterUserPayload {
    @NotBlank
    @Size(max = 19)
    private String mainCharacterName;
    @Size(max = 13)
    private String username;
    @NotBlank
    private String clientId;
    @NotBlank
    private String clientSecret;
    @NotBlank
    private String accessToken;

    public String getMainCharacterName() {
        return mainCharacterName;
    }

    public void setMainCharacterName(String mainCharacterName) {
        this.mainCharacterName = mainCharacterName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
