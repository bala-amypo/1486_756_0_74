package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerateValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@entity
public class LocationEntity{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double latitude;
    private Double longitude;
    public Long getId(){
        return id;
    }
    public void setID(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
}