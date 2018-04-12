package com.bd.controller;

import com.bd.message.request.FindDataRequest;
import com.bd.message.response.FindDataResponse;
import com.bd.service.IDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bd")
public class DataController {

    @Autowired
    private IDataService dataService;

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public FindDataResponse getData() {
        FindDataRequest req=new FindDataRequest();
        req.id=1;
        return dataService.getDatas(req);
    }
}
