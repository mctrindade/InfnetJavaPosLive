package br.edu.infnet.appmanutencao.model.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ManutencaoSemServicosException;

@Entity
@Table
public class Manutencao implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int box;
	private String placa;
	private LocalDate data;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Servico> servicos;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	
	public Manutencao() {
		this.data = LocalDate.now();
	}

	public Manutencao(Cliente cliente, List<Servico> servicos) throws ClienteNuloException, ManutencaoSemServicosException {
		this();
		if(cliente == null) {
			throw new ClienteNuloException("Impossivel criar uma Manutenção sem um Cliente!");
		}
//		
//		if(servicos == null) {
//			throw new ManutencaoSemServicosException("Impossivel criar uma manutenção sem uma listagem de serviços!");
//		}
//		
//		if(servicos.size() < 1) {
//			throw new ManutencaoSemServicosException("Impossivel criar uma manutenção com menos de um serviço!");
//		}
//		
		this.data = LocalDate.now();
		this.cliente  = cliente;
		this.servicos = servicos;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBox() {
		return box;
	}

	public void setBox(int box) {
		this.box = box;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Manutencao [id="+id+", box=" + box + ", placa=" + placa + ", data=" + data +" "+ cliente + servicos.size()+ "]";
	}

	@Override
	public void impressao() {
		System.out.println("#manutencao");
		System.out.println(this);
	}
}
