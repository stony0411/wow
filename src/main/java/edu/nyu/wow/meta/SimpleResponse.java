package edu.nyu.wow.meta;

import com.fasterxml.jackson.databind.util.JSONPObject;
import edu.nyu.wow.enums.ResponseStatus;
import netscape.javascript.JSObject;

/**
 * @Author: sw3455
 * @Date: 2021/11/24
 * @Email: sw3455@nyu.edu
 */
public class SimpleResponse<T> {
    private ResponseStatus responseStatus;
    private T data;

    public SimpleResponse(T t) {
        this.data = t;
        this.responseStatus = ResponseStatus.SUCCESS;
    }

    public SimpleResponse(T t, ResponseStatus status) {
        this.data = t;
        this.responseStatus = status;
    }

    public SimpleResponse() {
        this.data = null;
        this.responseStatus = ResponseStatus.SUCCESS;
    }

    public SimpleResponse<T> failed() {
        return new SimpleResponse<>(null, ResponseStatus.ERROR);
    }

    public T getData() {
        return data;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }
}
