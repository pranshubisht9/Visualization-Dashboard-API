package com.blackcoffer.visualdashboardapp.service;

import com.blackcoffer.visualdashboardapp.exceptions.InvalidDataException;
import com.blackcoffer.visualdashboardapp.model.Data;

import java.util.List;

//    -        Add end year filter in the dashboard
//-        Add topics filters in the dashboard
//-        Add sector filter in the dashboard
//-        Add region filter in the dashboard
//-        Add PEST filter in the dashboard
//-        Add Source filter in the dashboard
//-        Add SWOT filter in the dashboard
//-        Country
//-        City

public interface DataService {

    public List<Data> getByEndYear(Integer year) throws InvalidDataException;
    public List<Data> getByTopic(String topic) throws InvalidDataException;

public List<Data> getBySectorName(String sector) throws InvalidDataException;
    public List<Data> getByRegionName(String sector) throws InvalidDataException;
    public List<Data> getByPest(String to) throws InvalidDataException;
    public List<Data> getBySource(String source) throws InvalidDataException;

    public List<Data> getBySwot(String swot) throws InvalidDataException;
    public List<Data> getByCountry(String country) throws InvalidDataException;
    public List<Data> getByCity(String city) throws InvalidDataException;



}
