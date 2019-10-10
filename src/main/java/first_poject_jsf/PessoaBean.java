package first_poject_jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pessoaBean")
@SessionScoped
public class PessoaBean {
	
	private String nome;
	private String sobreNome;
	private String nomeCompleto;
	private List<String> nomes = new ArrayList<String>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto =  nomeCompleto;
	}
	
	public void concatenarNomes() {
		this.nomeCompleto = this.nome + " " + this.sobreNome;
		nomes.add(this.nomeCompleto);
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
}
