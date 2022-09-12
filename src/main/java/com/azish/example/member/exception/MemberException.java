package com.azish.example.member.exception;


import com.azish.example.common.BusinessException;

/**
 * member constraint exception
 */
public class MemberException extends BusinessException {

    protected MemberException(String message) {
        super(message);
    }
}
