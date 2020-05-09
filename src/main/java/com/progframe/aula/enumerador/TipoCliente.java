package com.progframe.aula.enumerador;

public enum TipoCliente {
	PESSOAFISICA (1, "Pessoa fisíca"),
	PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private int codigo;
	private String descricao;

	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer codigo) {
		
		if(codigo == null) {
			return null;
		}
		
		for (TipoCliente tipoCliente : TipoCliente.values()) {
			if(codigo.equals(tipoCliente.getCodigo())) {
				return tipoCliente;
			}
		
		}
			throw new IllegalArgumentException("Codigo invalido do Enum Tipo Cliente: "+codigo);
	}

}
