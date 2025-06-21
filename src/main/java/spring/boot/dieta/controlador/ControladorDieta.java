package spring.boot.dieta.controlador;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.dieta.model.Dieta;
import spring.boot.dieta.servico.ServicoDieta;

@RestController
@RequestMapping("dietases")
public class ControladorDieta 
{
	 @Autowired
     private ServicoDieta servicoDieta;
	 
	 @PostMapping("/adicionar")
	 public ResponseEntity<Dieta> criarDieta(@RequestBody Dieta dieta)  
	 {
		 Dieta nova = servicoDieta.adicionaDieta(dieta);
		 return ResponseEntity.ok(nova);
	 }
	 
	 @GetMapping("/listar")
	 public ResponseEntity<List<Dieta>> listaDietas()
	 {
		 List<Dieta> lista = servicoDieta.listarDietas();
		 return ResponseEntity.ok(lista);
	 } 
	 
	 @GetMapping("/dia")
	 public ResponseEntity<List<Dieta>> listaPorDia(@RequestParam 
			                             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) 
	                                     LocalDate dia)
	 {
		  List<Dieta> lista = servicoDieta.listaPorDia(dia);
		  return ResponseEntity.ok(lista);
	 }
	 
	 
	 
	 
	 
	 
	 
}
