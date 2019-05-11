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
public class RoutesDao {
    public static List<Routes> getListOfRoutes(){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        List<Routes> list2 = new ArrayList<Routes>();
       
        Transaction tx = null;       
        try {
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            list2 = session.createQuery("from Routes").list();                       
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
        return list2;
    }
}
