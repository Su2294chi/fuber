package com.suchi.fuber.demo_fuber.model.database;

import com.suchi.fuber.demo_fuber.model.entity.Cab;
import com.suchi.fuber.demo_fuber.model.repository.CabRepository;

import java.util.List;

public class Database {

    private static Database INSTANCE;

    private List<Cab> cabList;

    private Database() {
        CabRepository cabsRepository = new CabRepository();
        cabList = cabsRepository.getCabList();
    }

    public synchronized static Database getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Database();
        }

        return INSTANCE;
    }

    public List<Cab> getCabList() {
        return cabList;
    }

}
