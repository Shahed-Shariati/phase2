package ir.maktab.phase2.utility;

import ir.maktab.phase2.model.enumeration.ResponseStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseController<T> implements Serializable {
    private List<T> dataList;
    private String message;
    private boolean hasError;
    private ResponseStatus status;
    private Integer totalCount;

    public ResponseController(ResponseStatus status,List<T> dataList ) {
        this.dataList = dataList;
        this.status = status;
        this.message = "";
        this.hasError = false;
        this.totalCount = 0;
    }

    public ResponseController(ResponseStatus status,T data ) {
        this.dataList = new ArrayList<T>();
        this.dataList.add(data);
        this.status = status;
        this.message = "";
        this.hasError = false;
        this.totalCount = 1;
    }

    public ResponseController(ResponseStatus status,String message ) {
           this.dataList = new ArrayList<T>();
           this.status = status;
           this.message = message;
           this.hasError = false;
           this.totalCount = 0;
    }

    public ResponseController(ResponseStatus status,Exception ex ) {
        this.dataList = new ArrayList<T>();
        this.status = status;
        this.message = ex.getMessage();
        this.hasError = true;
        this.totalCount = 0;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
