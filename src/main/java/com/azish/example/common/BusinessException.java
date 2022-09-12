package com.azish.example.common;

/**
 * Business exception
 */
public class BusinessException extends Exception {
    protected BusinessException(String message) {
        super(message);
    }

}
