package com.vlad.learn.hybridschema.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chair {
    @Id
    @GeneratedValue
    @Getter @Setter private Long id;
    @Getter @Setter private Integer numberOfLegs;
}
