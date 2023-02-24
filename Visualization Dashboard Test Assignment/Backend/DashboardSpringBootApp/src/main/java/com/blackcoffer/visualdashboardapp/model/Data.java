package com.blackcoffer.visualdashboardapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sno;
    private Integer end_year;

    private BigDecimal citylng;
    private BigDecimal citylat;
    private Integer intensity;

    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;

    private Integer start_year;
    private Integer impact;

    private String added;
    private String published;
    private String city;
    private String country;

    private Integer relevance;
    private String pestle;
    private String source;
    private String title;

    private Integer likelihood;
}
