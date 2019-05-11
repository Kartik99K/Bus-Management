/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author KARTIK
 */
public class UserDao {
    public static User check(User obj){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        User u = null;
            
        try{
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            Transaction t = session.beginTransaction();
            //System.out.println(obj.getUname());
            u= (User) session.get(User.class, obj.getUname());
//            System.out.println(u);   
            t.commit();
            
            //System.out.println();
       }
           
       catch(Exception e) {
        e.printStackTrace();
    }
    finally{
        session.close();
        sf.close();
    }    
        
        if(obj.equals(u)){
//            System.out.println(u);    
            return u;
        }
        else{
            return null;
        }
    }
    
    public static List<User> getListOfUser(){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        List<User> list3 = new ArrayList<User>();
       
        Transaction tx = null;       
        try {
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            list3 = session.createQuery("from User").list();                       
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sf.close();
        }
        return list3;
    }
    
    public boolean delete(User obj){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        boolean flag=true;
//        List<BusInfo> list1 = new ArrayList<BusInfo>();
       // BusInfo b = new BusInfo();
        Transaction tx = null;       
        try {
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            session.delete(obj);
            tx.commit();
        } catch (Exception e) {
            flag=false;
            e.printStackTrace();
        } finally {
            session.close();
            sf.close();
        }
        return flag;
    }
    
    public boolean Add(User obj){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        boolean flag=true;
        Transaction tx = null;
        try{
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            
            session.save(obj);
            tx.commit();
        }
        catch(Exception e){
            flag=false;
            e.printStackTrace();
        }
        finally {
            session.close();
            sf.close();
        }
        return flag;
    }
}
