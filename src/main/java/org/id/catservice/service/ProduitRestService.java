package org.id.catservice.service;

import org.id.catservice.entities.Produit;
import org.id.catservice.entities.ProduitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitRestService{
    @Autowired
    private ProduitsRepository produitsRepository;

    @GetMapping(value = "/listProduit")
    public List<Produit> findAllByPage(){
        return produitsRepository.findAll();
    }
    @GetMapping(value = "/listProduit/{id}")
    public Produit findAllByPage( @PathVariable(name = "id") long id){
        return produitsRepository.findById(id).get();
    }
    @PutMapping(value = "/listProduit/{id}")
    public Produit updateProduit(@PathVariable(name = "id") long id, @RequestBody Produit p){
        p.setId(id);
        return produitsRepository.save(p);
    }
    @PostMapping(value = "/listProduit")
    public Produit saveProduit(@RequestBody Produit p){
        return produitsRepository.save(p);
    }
    @DeleteMapping(value = "/listProduit/{id}")
    public void deleteProduit(@PathVariable(name = "id") long id){
        produitsRepository.deleteById(id);
    }

}
