package com.bd.controller;

import com.bd.model.entity.DataEntity;

import com.bd.repository.IDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bd")
public class DataController {

    @Autowired
    private IDataRepository _dataRepository;

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public List<DataEntity> getData() {
        return _dataRepository.getAll();
    }
}
