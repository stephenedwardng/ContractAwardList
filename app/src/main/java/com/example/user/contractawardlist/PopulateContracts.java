package com.example.user.contractawardlist;

import java.util.ArrayList;

import behaviours.Cat;
import behaviours.Status;
import java.util.Date;

/**
 * Created by user on 07/07/2017.
 */

public class PopulateContracts {

    private ArrayList<Contract> list;

    public PopulateContracts() {
        list = new ArrayList<Contract>();
        list.add(new Contract("200 MacBook Pros", "Edward Ng", "Apple UK Ltd", Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen"));
        list.add(new Contract("600 Branded Codeclan Pens", "Edward Ng", "Corporate Gifts UK Ltd", Status.PIPELINE, Cat.MARKETING, 8, "2017-08-09", "2018-08-09", 1000, 1000, "Procurement of promotional branded pens for prospects and students"));
    }


    public ArrayList<Contract> getList() {
        return new ArrayList<Contract>(list);
    }


}
