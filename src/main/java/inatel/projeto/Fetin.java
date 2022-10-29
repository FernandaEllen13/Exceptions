package inatel.projeto;
import inatel.exception.checked.NotaInsuficiente;
import inatel.exception.uncheked.ProjetoJaExistente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fetin
{
    String nome_projeto;
    double nota_projeto;

    public void projeto(String nome_projeto, double nota_projeto)
    {

    }


    //lista:
    List<String> Aux_nome = new ArrayList<>();

    //HashMap:
    Map<String,Double> map = new HashMap<String,Double>();

    public void map(String nome_projeto, double nota_projeto) throws NotaInsuficiente,ProjetoJaExistente {
        if ((nota_projeto > 60) || (map.containsKey(nome_projeto)) )
        {
            map.put(nome_projeto, nota_projeto);
        }
        else if(nota_projeto < 60)
        {
            throw new NotaInsuficiente("Nota Insuficiente!");
        }

        else {
            throw new ProjetoJaExistente("Projeto ja existente!");
        }

    }

    public void Aux_nome(String nome_projeto) throws ProjetoJaExistente
    {
        if(!Aux_nome.contains(nome_projeto))
        {
            Aux_nome.add(nome_projeto);
        }
        else{
            throw new ProjetoJaExistente("Esse projeto já existe.");
        }
    }

    public void mostraInfo()
    {
        map.forEach((nome_projeto,nota_projeto)->
        {
            System.out.println("Nome do projeto: " + nome_projeto);
            System.out.println("Nota do projeto: " + nota_projeto);
        });
    }

}
