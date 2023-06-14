package com.example.inventoryservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "availability")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Availability {

    @Id
    private String uniqId;
    private Boolean status;
}
