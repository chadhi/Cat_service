package org.id.catservice;

import org.id.catservice.entities.Produit;
import org.id.catservice.entities.ProduitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {

    @Autowired
    private ProduitsRepository produitsRepository;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitsRepository.save(new Produit(null,"Ordinateur Z400",6000,12));
        produitsRepository.save(new Produit(null,"Imprimente",3000,10));
        produitsRepository.save(new Produit(null,"Smart phone",4000,3));
        produitsRepository.findAll().forEach(p->System.out.println(p.toString()));
    }
}
