package spring.boot.dieta.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
public class Alimento 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double quantidade;
	private String unidade;
	private Integer calorias;
	
	@ManyToOne
	@JoinColumn(name = "dieta_id")
	@JsonIgnore
	private Dieta dieta;
	
	public void setId(Long id){this.id = id;}
	public void setNome(String nome){this.nome = nome;}
	public void setQuantidade(Double quantidade){this.quantidade = quantidade;}
	public void setUnidade(String unidade){this.unidade = unidade;}
	public void setCalorias(Integer calorias){this.calorias = calorias;}
	public void setDieta(Dieta dieta){this.dieta = dieta;}
	
	public Long getId(){return id;}
	public String getNome(){return nome;}
	public Double getQuantidade(){return quantidade;}
	public String getUnidade(){return unidade;}
	public Integer getCalorias(){return calorias;}
	public Dieta getDieta(){return dieta;}
	
}
