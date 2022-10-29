package inatel;

import inatel.excecoes.checked.NotaInsuficiente;
import inatel.excecoes.unchecked.ProjetoJaExistente;
import inatel.projeto.Fetin;

public class Main {
    public static void main(String[]args)
    {
        Fetin f1 = new Fetin();
        Fetin f2 = new Fetin();
        Fetin f3 = new Fetin();
        Fetin f4 = new Fetin();


        //tratamento exceções:
        try
        {
            f1.map("Semáforo Inteligente",70d);
            f2.map("InaTíbia", 100d);
            f3.map("Próteses", 40d);
            f4.map("IA para deficientes", 70d);
        }
        catch (NotaInsuficiente | ProjetoJaExistente e)
        {
            e.printStackTrace();

        }

        f1.mostraInfo();
        f2.mostraInfo();
        f3.mostraInfo();
        f4.mostraInfo();
    }
}
