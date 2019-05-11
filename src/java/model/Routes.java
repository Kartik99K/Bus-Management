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
public class Routes {
   @Id
   private String busId;
   private String routes;
   private String pickuppoint;

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getRoutes() {
        return routes;
    }

    public void setRoutes(String routes) {
        this.routes = routes;
    }

    public String getPickuppoint() {
        return pickuppoint;
    }

    public void setPickuppoint(String pickuppoint) {
        this.pickuppoint = pickuppoint;
    }

    @Override
    public String toString() {
        return "Routes{" + "busId=" + busId + ", routes=" + routes + ", pickuppoint=" + pickuppoint + '}';
    }
}
