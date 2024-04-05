package org.acme.hibernate.orm.panache.entity;


import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


import java.util.List;

@ApplicationScoped
public class EntityService {
@Inject
   public EntityService(){}



    public List<FruitEntity> entityList(){
    return FruitEntity.listAll();
    }



    }


