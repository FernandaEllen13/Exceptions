package inatel;

import inatel.exception.checked.NotaInsuficiente;
import inatel.exception.uncheked.ProjetoJaExistente;
import inatel.projeto.Fetin;

public class Main {
    public static void main(String[]args)
    {
        Fetin[] projetos = new Fetin[4];
        projetos[0] = new Fetin();
        projetos[1] = new Fetin();
        projetos[2] = new Fetin();
        projetos[3] = new Fetin();

        
        try
        {
            projetos[0].map("Semáforo Inteligente",70d);
            projetos[1].map("InaTíbia",100d);
            projetos[2].map("Proteses",40d);
            projetos[3].map("InaTibia",70d);
        }

        catch(NotaInsuficiente | ProjetoJaExistente e)
        {
            e.printStackTrace();
        }

        for(int i = 0; i < projetos.length; i++)
        {
            projetos[i].mostraInfo();
        }

    }
}
