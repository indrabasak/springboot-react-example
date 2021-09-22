package com.basaki.react.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Beer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Beer(String name) {
        this.name = name;
    }
}
