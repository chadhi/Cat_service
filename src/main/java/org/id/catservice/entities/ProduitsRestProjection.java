package org.id.catservice.entities;

import org.id.catservice.entities.Produit;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1",types = Produit.class)
public interface ProduitsRestProjection {
    public double getPrice();
    public String getDesignation();
    //public int getQuantite();
}
