import org.example.Cliente;
import org.example.Endereco;
import org.example.Pedido;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Cliente c = new Cliente(1, "Pedro V", new Endereco("americo luz", 794), new Pedido("Bisnaga de Frango", 2, 390));


        Cliente clienteClone = c.clone();
        clienteClone .setId(2);
        clienteClone .setNome("Pedro Clonado");
        clienteClone .getEndereco().setLogradouro("americo lobo");
        clienteClone .getEndereco().setNumero(10);

        assertEquals("Cliente{id=1, nome='Pedro V', endereco=Endereco{logradouro='americo luz', numero=794}, pedido='Pedido{nome='Bisnaga de Frango'valor='390.0', quantidade Pedido=2}'}", c.toString());
        assertEquals("Cliente{id=2, nome='Pedro Clonado', endereco=Endereco{logradouro='americo lobo', numero=10}, pedido='Pedido{nome='Bisnaga de Frango'valor='390.0', quantidade Pedido=2}'}", clienteClone.toString());

    }

}
