package ufpbaps;

public class Main {

	public static void main(String[] args) {
		 Centro centro;
			Curso curso;
			
			curso = new Curso("Sistemas de Informacao", 40, "80114465");
	        
	        centro = new Centro(new ValidaNomeCurso());
			
			if (!centro.validarCurso(curso))
				throw new RuntimeException("Nome do curso incorreto.");

			centro.setValidaStrategy(new ValidaCargaHorariaCurso());
			if (!centro.validarCurso(curso))
				throw new RuntimeException("Carga horária inválida.");
			
			centro.setValidaStrategy(new ValidaCodigoCurso());
			if (!centro.validarCurso(curso))
				throw new RuntimeException("Codigo do curso incorreto.");
			
			

	}

}
