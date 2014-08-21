package ufpbaps;

public class ValidaCodigoCurso implements ValidaCursoStrategy {

	public boolean validar(Curso c) {
		System.out.println("Código do curso" + ":" + "80114465");
		return true;
	} 

}
