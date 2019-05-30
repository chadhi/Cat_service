package org.id.catservice.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitsRepository extends JpaRepository<Produit,Long> {
}
