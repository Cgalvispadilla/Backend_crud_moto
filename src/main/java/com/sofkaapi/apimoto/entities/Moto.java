package com.sofkaapi.apimoto.entities;

import javax.persistence.*;

@Entity
public class Moto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "marca", nullable = false)
    private String marca;
    @Column(name = "color", nullable = false)
    private String color;
    @Column(name = "modelo", nullable = false)
    private String modelo;
}
