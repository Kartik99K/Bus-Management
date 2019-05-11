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
public class BusInfo {
    @Id
    private String busId;
    private String driverName;
    private String routes;

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getRoutes() {
        return routes;
    }

    public void setRoutes(String routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "BusInfo{" + "busId=" + busId + ", driverName=" + driverName + ", routes=" + routes + '}';
    }
    
    
}
