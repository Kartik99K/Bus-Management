/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author KARTIK
 */
@Entity
public class Buses {
    @Id
    private String busId;
    private String DriverName;
    private String DriverNumber;

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getDriverNumber() {
        return DriverNumber;
    }

    public void setDriverNumber(String DriverNumber) {
        this.DriverNumber = DriverNumber;
    }

    @Override
    public String toString() {
        return "Buses{" + "busId=" + busId + ", DriverName=" + DriverName + ", DriverNumber=" + DriverNumber + '}';
    }
}
