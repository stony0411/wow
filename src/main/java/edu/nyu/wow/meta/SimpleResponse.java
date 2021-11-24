package edu.nyu.wow.meta;

import edu.nyu.wow.enums.ResponseStatus;

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

    public SimpleResponse() {
        this.data = null;
        this.responseStatus = ResponseStatus.ERROR;
    }

    public SimpleResponse<T> failed() {
        return new SimpleResponse<>();
    }
}
