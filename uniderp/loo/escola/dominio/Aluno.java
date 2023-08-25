package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa {

    private String matricula;
    private LocalDate dataMatricula;
    
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    }
    public Aluno() {
    }
    

    
    
}
