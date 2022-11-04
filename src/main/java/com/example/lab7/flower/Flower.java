package com.example.lab7.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter @AllArgsConstructor @Entity @Table @NoArgsConstructor
public class Flower
{
    @GeneratedValue @Id
    private int id;
    private String color;
    private double sepalLength;
    private double price;

}
