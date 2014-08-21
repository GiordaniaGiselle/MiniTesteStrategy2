package ufpbaps;

public class Centro {
    private ValidaCursoStrategy valida_strategy;
	 
    public Centro(ValidaCursoStrategy _strategy) {
        this.valida_strategy = _strategy;
    }

	public void setValidaStrategy(ValidaCursoStrategy _strategy) {
		valida_strategy = _strategy;
	}

    public boolean validarCurso(Curso c) {
        return this.valida_strategy.validar(c);
    }
}

