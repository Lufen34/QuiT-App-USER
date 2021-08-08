package com.quitapp.user.entities;

import com.quitapp.user.enums.RoleType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name="external_id")
    private UUID externalId;
    @OneToMany(mappedBy = "role")
    private List<User> user = new ArrayList<>();

    public Role() {
        externalId = UUID.randomUUID();
    }
    public Role(RoleType name) {
        externalId = UUID.randomUUID();
        this.name = name.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getExternalId() {
        return externalId;
    }

    public void setExternalId(UUID externalId) {
        this.externalId = externalId;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
