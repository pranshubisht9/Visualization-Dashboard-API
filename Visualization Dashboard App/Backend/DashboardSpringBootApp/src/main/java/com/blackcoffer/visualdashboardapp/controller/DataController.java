package com.blackcoffer.visualdashboardapp.controller;

import com.blackcoffer.visualdashboardapp.exceptions.InvalidDataException;
import com.blackcoffer.visualdashboardapp.model.Data;
import com.blackcoffer.visualdashboardapp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DataController {

    @Autowired
     private DataService service ;


    @GetMapping("/end-year/{year}")
    public ResponseEntity<List<Data>> getDataByEndYearHandler(@PathVariable("year") Integer year) throws InvalidDataException {
        List<Data> list = service.getByEndYear(year);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/topic")
    public ResponseEntity<List<Data>> getDataByTopicHandler(@RequestParam("keyword") String topic) throws InvalidDataException {
        List<Data> list = service.getByTopic(topic);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/sector")
    public ResponseEntity<List<Data>> getDataBySectorHandler(@RequestParam("keyword") String sector) throws InvalidDataException {
     List<Data> list = service.getBySectorName(sector);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping("/region")
    public ResponseEntity<List<Data>> getDataByRegionHandler(@RequestParam("keyword") String region) throws InvalidDataException {
        List<Data> list = service.getByRegionName(region);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/pestle")
    public ResponseEntity<List<Data>> getDataByPestleHandler(@RequestParam("keyword") String pest) throws InvalidDataException {
        List<Data> list = service.getByPest(pest);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/source")
    public ResponseEntity<List<Data>> getDataBySourceHandler(@RequestParam("keyword") String source) throws InvalidDataException {
        List<Data> list = service.getBySource(source);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/swot")
    public ResponseEntity<List<Data>> getDataBySwotHandler(@RequestParam("keyword") String pest) throws InvalidDataException {
        List<Data> list = service.getBySwot(pest);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/country")
    public ResponseEntity<List<Data>> getDataByCountryHandler(@RequestParam("keyword") String country) throws InvalidDataException {
        List<Data> list = service.getByCountry(country);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/city")
    public ResponseEntity<List<Data>> getDataByCityHandler(@RequestParam("keyword") String city) throws InvalidDataException {
        List<Data> list = service.getByCity(city);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
