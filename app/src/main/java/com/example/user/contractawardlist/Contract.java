package com.example.user.contractawardlist;

import java.util.Date;

import behaviours.Cat;
import behaviours.Status;

/**
 * Created by user on 07/07/2017.
 */

public class Contract {

    private String title;
    private String manager;
    private String supplier;
    private Status status;
    private Cat category;
    private int strategicImportanceRating;
    private String startDate;
    private String endDate;
    private int contractedValue;
    private int actualValue;
    private String description;

    public Contract(String title, String manager, String supplier, Status status, Cat category, int strategicImportanceRating, String startDate, String endDate, int contractedValue, int actualValue, String description) {
        this.title = title;
        this.manager = manager;
        this.supplier = supplier;
        this.status = status;
        this.category = category;
        this.strategicImportanceRating = strategicImportanceRating;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractedValue = contractedValue;
        this.actualValue = actualValue;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cat getCategory() {
        return category;
    }

    public void setCategory(Cat category) {
        this.category = category;
    }

    public int getStrategicImportanceRating() {
        return strategicImportanceRating;
    }

    public void setStrategicImportanceRating(int strategicImportanceRating) {
        this.strategicImportanceRating = strategicImportanceRating;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getContractedValue() {
        return contractedValue;
    }

    public void setContractedValue(int contractedValue) {
        this.contractedValue = contractedValue;
    }

    public int getActualValue() {
        return actualValue;
    }

    public void setActualValue(int actualValue) {
        this.actualValue = actualValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public int daysToExpiry() {
////        return endDate - startDate
//    }

}
