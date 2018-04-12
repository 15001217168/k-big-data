package com.bd.service;

import com.bd.message.request.FindDataRequest;
import com.bd.message.response.FindDataResponse;
import org.springframework.stereotype.Service;

@Service
public interface IDataService {
    FindDataResponse getDatas(FindDataRequest req);
}
