package spring.boot.dieta.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.dieta.model.Alimento;
import spring.boot.dieta.repositorio.RepositorioAlimento;

@Service
public class ServicoAlimento 
{
	 @Autowired
     private RepositorioAlimento repositorioAlimento;
	 	 
}
