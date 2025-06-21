package spring.boot.dieta.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.dieta.model.Alimento;

@Repository
public interface RepositorioAlimento extends JpaRepository<Alimento, Long>
{}
