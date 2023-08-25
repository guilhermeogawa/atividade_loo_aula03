import java.time.LocalDate;

import uniderp.loo.escola.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor P1 = new Professor();
        P1.setCodigo(1);
        P1.setNome("Luizao");
        P1.setEndereco("uniderp?");
        P1.setTelefone("67999999999");
        P1.setDataNascimento(LocalDate.of(2023,8,24));
        P1.setRg("66666666666");
        P1.setCpf("66666666666");
        P1.setDataInsercao(LocalDate.now());


        
    }

}
