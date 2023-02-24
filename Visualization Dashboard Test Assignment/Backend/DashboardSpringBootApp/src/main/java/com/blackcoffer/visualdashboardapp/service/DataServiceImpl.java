package com.blackcoffer.visualdashboardapp.service;

import com.blackcoffer.visualdashboardapp.exceptions.InvalidDataException;
import com.blackcoffer.visualdashboardapp.model.Data;
import com.blackcoffer.visualdashboardapp.repository.DataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
   private DataDao dao;

    @Override
    public List<Data> getByEndYear(Integer year) throws InvalidDataException {
        List<Data> dataList= dao.getDataByEndYear(year);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with this end year: "+year);
    }

    @Override
    public List<Data> getByTopic(String topic) throws InvalidDataException {
        List<Data> dataList= dao.findByTopic(topic);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with this topic: "+topic);

    }

    @Override
    public List<Data> getBySectorName(String sector) throws InvalidDataException {
        List<Data> dataList= dao.findBySector(sector);

        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with sector: "+sector);

    }

    @Override
    public List<Data> getByRegionName(String region) throws InvalidDataException {

        List<Data> dataList= dao.findByRegion(region);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with region: "+region);

    }

    @Override
    public List<Data> getByPest(String pest) throws InvalidDataException {
        List<Data> dataList= dao.findByPestle(pest);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with pestle: "+pest);
    }

    @Override
    public List<Data> getBySource(String source) throws InvalidDataException {
        List<Data> dataList= dao.findBySource(source);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with source: "+source);
    }

    @Override
    public List<Data> getBySwot(String swot) throws InvalidDataException {
        List<Data> dataList= dao.findBySwot(swot);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with swot: "+swot);
    }

    @Override
    public List<Data> getByCountry(String country) throws InvalidDataException {
        List<Data> dataList= dao.findByCountry(country);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with country: "+country);
    }

    @Override
    public List<Data> getByCity(String city) throws InvalidDataException {
        List<Data> dataList= dao.findByCity(city);
        if(!dataList.isEmpty())
            return dataList;
        else
            throw new InvalidDataException("No data found with city: "+city);
    }
}
