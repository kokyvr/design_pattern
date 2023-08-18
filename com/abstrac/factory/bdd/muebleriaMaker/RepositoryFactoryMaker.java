package com.abstrac.factory.bdd.muebleriaMaker;

import com.abstrac.factory.bdd.abstractRepo.AbstractRepositoryFactory;
import com.abstrac.factory.bdd.abstractRepo.MongoRepositoryFactory;
import com.abstrac.factory.bdd.abstractRepo.RelacionalRepository;

public class RepositoryFactoryMaker {
    private RepositoryFactoryMaker(){

    }
    public static AbstractRepositoryFactory getRepositoryFactory(TipoRepositorio tipo){
        if(TipoRepositorio.MONGO_DB.equals(tipo)){
            return new MongoRepositoryFactory();
        }
        return new RelacionalRepository();
    }
}
