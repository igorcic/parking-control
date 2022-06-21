package com.example.parkingcontrol.models;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_PARKINGSPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;
}
