
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Grupo;
import br.edu.ifsul.modelo.Marca;
import br.edu.ifsul.modelo.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 */
public class TestePersistirProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-2016-1-5N1-ModelPU");
        EntityManager em = emf.createEntityManager();        
        Grupo g = em.find(Grupo.class, 1);
        Marca m = em.find(Marca.class, 1);
        Produto p = new Produto();
        p.setNome("Mouse Microsoft");
        p.setDescricao("Mouse Laser");
        p.setPreco(80.00);
        p.setEstoque(10.0);
        p.setGrupo(g);
        p.setMarca(m);
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
