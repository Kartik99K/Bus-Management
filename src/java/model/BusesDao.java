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
public class BusesDao {
    public static List<Buses> getListOfBuses(){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        
        List<Buses> list = new ArrayList<Buses>();
       
        Transaction tx = null;       
        try {
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Buses").list();                       
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
        return list;
    }
}
