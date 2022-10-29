package inatel.excecoes.checked;

public class NotaInsuficiente extends RuntimeException
{
    public NotaInsuficiente(String message)
    {
        super(message);
    }
}
