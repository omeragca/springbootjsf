package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Flight {

    @Id
    @GeneratedValue
    private Long id;

    private String airline;
    private String fromAirport;
    private String toAirport;

    private Date scheduledDateTime;
    private Date estimatedDateTime;
    private Date actualDateTime;

}
