
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Grupo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.event.spi.PersistEvent;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 */
public class TestePersistirGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-2016-1-5N1-ModelPU");
        EntityManager em = emf.createEntityManager();
        Grupo g = new Grupo();
        g.setNome("Eletrônicos");
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
