package com.example.user.contractawardlist;

import org.junit.Before;
import org.junit.Test;

import behaviours.Cat;
import behaviours.Status;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/07/2017.
 */

public class ContractTest {

    Contract contract;

    @Before
    public void setup() throws Exception {

        contract = new Contract("200 MacBook Pros", "Edward Ng", "Apple UK Ltd", Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");

    }

    @Test
    public void canGetTitle() throws Exception{
        assertEquals("200 MacBook Pros", contract.getTitle());
    }

    @Test
    public void canGetStatus() throws Exception{
        assertEquals(Status.LIVE, contract.getStatus());
    }

    @Test
    public void canGetStrategicImportanceRating() throws Exception{
        assertEquals(3, contract.getStrategicImportanceRating());
    }


}
