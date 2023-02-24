package com.blackcoffer.visualdashboardapp.repository;

import com.blackcoffer.visualdashboardapp.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

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
@Repository
public interface DataDao extends JpaRepository<Data, Integer> {
    @Query("select d from Data d where d.end_year=?1")
    public List<Data> getDataByEndYear(Integer year);

//    @Query("select d from Data d where d.topic=?1")
    public List<Data> findByTopic(String topic);
    public List<Data> findBySector(String sector);
    public List<Data> findByRegion(String region);

    public List<Data> findByPestle(String pest);

    public List<Data> findBySource(String source);

    public List<Data> findBySwot(String swot);

    public List<Data> findByCountry(String country);

    public List<Data> findByCity(String city);

}
