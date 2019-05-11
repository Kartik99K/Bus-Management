/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author KARTIK
 */
@Entity
public class User {
    @Id
    private String uname;
    private String Pwd;
    private String name;
    private String Dob;
    private String email;
    private String current_route;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrent_route() {
        return current_route;
    }

    public void setCurrent_route(String current_route) {
        this.current_route = current_route;
    }
    
   
    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    public void setUname(String uname)
    {
        this.uname=uname;
    }
    
    public String getPwd() {
        return Pwd;
    }
    
    public String getUname()
    {
        return uname;
    }

    @Override
    public String toString() {
        return "User{" + "uname=" + uname + ", Pwd=" + Pwd + ", name=" + name + ", Dob=" + Dob + ", email=" + email + ", current_route=" + current_route + ", type=" + type + '}';
    }

//    @Override
//    public String toString() {
//        return name;
//    }

    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        if(u ==  null){
            return false;
        }
        if(Pwd.equalsIgnoreCase(u.getPwd()) && type.equalsIgnoreCase(u.getType())){
            return true;
        }
        else{
            return false;
        }
    }
    
}
