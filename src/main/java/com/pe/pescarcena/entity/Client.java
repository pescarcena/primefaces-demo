package com.pe.pescarcena.entity;

import java.io.Serializable;

/**
 * Created by root on 6/6/16.
 */
public class Client implements Serializable {
    private String clientCode;
    private String name;
    private String address;
    private String city;

    public Client(String clientCode, String name, String address, String city) {
        this.clientCode = clientCode;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String codeClient) {
        this.clientCode = codeClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adresse) {
        this.address = adresse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String ville) {
        this.city = ville;
    }
}
