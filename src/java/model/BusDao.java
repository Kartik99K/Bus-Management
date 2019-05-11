/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author KARTIK
 */
public class BusDao {
        public boolean add(Bus o){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        boolean flag=true;
        Transaction tx = null;       
        try {
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            session.save(o);
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
    
}
