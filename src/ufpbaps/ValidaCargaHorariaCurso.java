package ufpbaps;

public class ValidaCargaHorariaCurso implements ValidaCursoStrategy {
    public boolean validar(Curso c) {
        System.out.println("Carga horária" + ":" + "40");
		return true;
    }

}
