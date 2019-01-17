package com.suchi.fuber.demo_fuber.model.repository;

import com.suchi.fuber.demo_fuber.model.entity.Cab;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CabRepositoryTest {

    private CabRepository repository;

    @Before
    public void init() {
        repository = new CabRepository();
    }

    @Test
    public void testIfCabsListIsNotNull() {
        assertNotNull(repository.getCabList());
    }

    @Test
    public void testIfCabsListIsNotEmpty() {
        assertNotEquals(0, repository.getCabList().size());
    }

    @Test
    public void testIfCabLIstHasSixElements() {
        assertEquals(6, repository.getCabList().size());
    }

    @Test
    public void testIfAllCabsHaveDifferentId() {
        Set<Integer> set = new HashSet<>();
        for (Cab cab: repository.getCabList()) {
            set.add(cab.getId());
        }

        assertEquals(set.size(), repository.getCabList().size());
    }

    @Test
    public void testIfCabLocationIsNotNull(){
        for(Cab cab :repository.getCabList()){
            assertNotNull(cab.getLocation());
        }
    }
}