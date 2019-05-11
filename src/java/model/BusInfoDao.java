/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author KARTIK
 */
public class BusInfoDao {
    public static List<BusInfo> getListOfBusInfo(){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        List<BusInfo> list1 = new ArrayList<BusInfo>();
       // BusInfo b = new BusInfo();
        Transaction tx = null;       
        try {
            cf = new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf  = cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.getTransaction();
            tx.begin();
            list1 = session.createQuery("from BusInfo").list();
            
            //Query query = session.createQuery("delete from StudentHql where busid > :n");
            //query.setParameter("n", );
            //query.executeUpdate();
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
        return list1;
    }
    
     public boolean delete(BusInfo o){
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
            session.delete(o);
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
