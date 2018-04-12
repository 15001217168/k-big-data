package com.bd.message.response;

import com.bd.message.Response;
import com.bd.message.view.model.DataViewModel;

public class FindDataResponse extends Response {
    private DataViewModel data;

    public DataViewModel getData() {
        return data;
    }

    public void setData(DataViewModel data) {
        this.data = data;
    }
}
