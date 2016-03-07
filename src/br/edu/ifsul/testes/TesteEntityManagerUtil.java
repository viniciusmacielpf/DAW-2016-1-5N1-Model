
package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Marca;
import javax.persistence.EntityManager;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 */
public class TesteEntityManagerUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Marca m = new Marca();
        m.setNome("Acer");
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
    }

}
