package ufpbaps;

public class Curso {
	
	 private String nome;
	    private int carga_horaria;
	    private String codigo;
	 
	    public Curso(String _nome, int ch, String _codigo) {
			this.nome = _nome;
			carga_horaria = ch;
			this.codigo = _codigo;
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCarga_horaria() {
			return carga_horaria;
		}

		public void setCarga_horaria(int carga_horaria) {
			this.carga_horaria = carga_horaria;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

}
