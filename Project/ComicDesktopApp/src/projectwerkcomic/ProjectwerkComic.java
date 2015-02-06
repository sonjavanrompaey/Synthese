/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwerkcomic;

import dal.Comic;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sonja
 */
public class ProjectwerkComic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("ProjectwerkComicPU");
        EntityManager em = emf.createEntityManager();
        
//        Comic comic = new Comic();
//        comic.setUitgever("Dc");
//        comic.setTitel("BATMAN ARKHAM REBORN TP");        
//        comic.setIsbn("978140122708151299");
//        comic.setPrijs(12.99);   
//        Comic comic = new Comic();
//        comic.setUitgever("Dc");
//        comic.setTitel("BATMAN vs ROBIN TP");        
//        comic.setIsbn("978140122708151299");
//        comic.setPrijs(20.99);  
                   
        
        EntityTransaction trans = em.getTransaction();
        trans.begin();
//        em.persist(comic);
//        em.persist(comic);
        trans.commit();
    }
    
}
