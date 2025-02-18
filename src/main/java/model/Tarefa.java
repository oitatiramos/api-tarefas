package model;

public class Tarefa {
	
	private Integer id;
	private String descricao;
	private Integer prazo;
	private boolean finalizada;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getPrazo() {
		return prazo;
	}
	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}
	public boolean isFinalizada() {
		return finalizada;
	}
	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	
	@Override
	public String toString() {
		return "Tarefas [id=" + id + ", descricao=" + descricao + ", prazo=" + prazo + ", finalizada=" + finalizada
				+ "]";
	}
}
