package com.handsome.balloonblog.commons.exception;

import com.handsome.balloonblog.commons.result.Result;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: balloonblog
 * @description:
 * @author: handsome
 * @create: 2020-08-06 15:14
 **/
@Getter
@Setter
public class ResultException extends Exception {

    private Result result;

    public ResultException() {
    }

    public ResultException(Result result) {
        this.result = result;
    }

    public ResultException(Throwable cause, Result result) {
        super(cause);
        this.result = result;
    }
}
