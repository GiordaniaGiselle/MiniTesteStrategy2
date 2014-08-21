package ufpbaps;

public class ValidaNomeCurso implements ValidaCursoStrategy {
    public boolean validar(Curso c) {
        System.out.println("Nome do curso" + ":" + "Sistemas de Informacao");
		return true;
    } 

}
