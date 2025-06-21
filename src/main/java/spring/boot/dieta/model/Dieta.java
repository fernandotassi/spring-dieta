package spring.boot.dieta.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Dieta implements Serializable
{
      private static final long serialVersionUID = 1L;
      
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
      private LocalDate dia;
      private LocalTime horario;
      
      @OneToMany(mappedBy = "dieta", cascade = CascadeType.ALL, orphanRemoval = true)
      private List<Alimento> alimentos;
      
      public Dieta(){}
      public Dieta(Long id, LocalDate dia, LocalTime horario)
      {this.id = id; this.dia = dia; this.horario = horario;}
      
      public void setId(Long id){this.id = id;}
      public void setDia(LocalDate dia){this.dia = dia;}
      public void setHorario(LocalTime horario){this.horario = horario;}
      public void setAlimentos(List<Alimento> alimentos){this.alimentos = alimentos;}
      
      public Long getId(){return id;}
      public LocalDate getDia(){return dia;}
      public LocalTime getHorario(){return horario;}
      public List<Alimento> getAlimentos(){return alimentos;}
	  
      @Override
	  public int hashCode() {
		return Objects.hash(id);
	  }
	  @Override
	  public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dieta other = (Dieta) obj;
		return Objects.equals(id, other.id);
	  }
      
      
      
      
      
      
}
