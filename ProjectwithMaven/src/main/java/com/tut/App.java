package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());

        Students st=new Students();
        st.setId(101);
        st.setName("Mayur");
        st.setCity("Pune");
        
        System.out.println(st);
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        session.persist(st);
        tx.commit();
        session.close();
    }
}
