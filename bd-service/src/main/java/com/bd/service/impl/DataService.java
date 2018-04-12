package com.bd.service.impl;

import com.bd.message.request.FindDataRequest;
import com.bd.message.response.FindDataResponse;
import com.bd.message.view.model.DataViewModel;
import com.bd.model.entity.DataEntity;
import com.bd.repository.IDataRepository;
import com.bd.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService implements IDataService {

    @Autowired
    private IDataRepository dataRepository;

    @Override
    public FindDataResponse getDatas(FindDataRequest req) {
        FindDataResponse resp = new FindDataResponse();
        DataEntity data = dataRepository.getById(req.id);
        if (data != null) {
            resp.setData(new DataViewModel(data.getData()));
        } else {
            resp.setData(new DataViewModel("无数据"));
        }
        return resp;
    }
}
