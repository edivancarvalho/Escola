package bll;

import dao.ContatoDao;
import java.util.List;
import model.Alunos;
import model.Contato;

/**
 *
 * @author edivan
 */
public class ContatoBll {

    private ContatoDao contatoDao;

    public ContatoBll() {
        contatoDao = new ContatoDao();
    }

    // metodo adicionar receber os parametros da classe Contato → aluno.
    public void adicionaContato(Contato contato) throws Exception {
        // 
        contatoDao.adicionarContato(contato);
    }
    
    public List<Contato> consultarContato() throws Exception {
        return contatoDao.getAllContato();
    }

    // Metodo de ordenação;
    public void ordenaListaContato(List<Contato> lista) throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i; j < lista.size(); j++) {
                if (lista.get(i).getAluno().getNome().compareToIgnoreCase(lista.get(j).getAluno().getNome()) >= 0) {
                    Contato temp = lista.get(j);
                    lista.set(j, lista.get(i));
                    lista.set(i, temp);
                }
            }
        }
        // retorna o array ordenado por nome
    }
}
