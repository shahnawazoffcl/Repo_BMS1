package com.bookmyshowbyshah.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class User extends BaseModel{
    private String name;
    private String email;
    @OneToMany
    private List<Ticket>  tickets;
}
