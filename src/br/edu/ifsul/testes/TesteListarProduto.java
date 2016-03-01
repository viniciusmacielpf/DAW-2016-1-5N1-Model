
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 */
public class TesteListarProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-2016-1-5N1-ModelPU");
        EntityManager em = emf.createEntityManager(); 
        List<Produto> lista = em.createQuery("from Produto order by nome").getResultList();
        for (Produto p : lista){
            System.out.println("Produto: "+p.getNome()+" Marca: "+p.getMarca().getNome()+ 
                    " Grupo: "+p.getGrupo().getNome());
        }
        
    }

}
