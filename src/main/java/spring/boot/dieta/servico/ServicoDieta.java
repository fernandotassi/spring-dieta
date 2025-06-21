package spring.boot.dieta.servico;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.dieta.model.Dieta;
import spring.boot.dieta.repositorio.RepositorioDieta;

@Service
public class ServicoDieta 
{
     @Autowired
     private RepositorioDieta repositorioDieta;
     
     public Dieta adicionaDieta(Dieta dieta)
     {
    	 dieta.getAlimentos().forEach(alimento -> alimento.setDieta(dieta));
    	 return repositorioDieta.save(dieta);
     }
     
     public List<Dieta> listarDietas()
     {return repositorioDieta.findAll();}
     
     public List<Dieta> listaPorDia(LocalDate dia)
     {
    	 return repositorioDieta.findByDia(dia);
     }
     
     
}
