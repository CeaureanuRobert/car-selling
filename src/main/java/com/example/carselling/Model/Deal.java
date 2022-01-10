//package com.example.carselling.Model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="Deals")
//public class Deal {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(name="price")
//    private float price;
//
//    @Column(name="cc")
//    private float cc;
//
//    @Column(name="year")
//    private int year;
//
//    @Column(name="hp")
//    private int hp;
//
//    @Column(name="fuel")
//    private String fuel;
//
//    @Column(length = 64)
//    private String photos;
//
//    public Deal(){
//
//    }
//
//    public Deal(float price, float cc, int year, int hp, String fuel, String photos){
//        super();
//        this.price = price;
//        this.cc = cc;
//        this.year=year;
//        this.hp=hp;
//        this.fuel=fuel;
//        this.photos=photos;
//    }
//
//    public String getPhotos() {
//        return photos;
//    }
//
//    public void setPhotos(String photos) {
//        this.photos = photos;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public float getCc() {
//        return cc;
//    }
//
//    public void setCc(float cc) {
//        this.cc = cc;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//
//    public String getFuel() {
//        return fuel;
//    }
//
//    public void setFuel(String fuel) {
//        this.fuel = fuel;
//    }
//
//
//}
