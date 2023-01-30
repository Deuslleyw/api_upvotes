package com.deusley.api_upvotes.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;


    @ControllerAdvice
    public class ResourceExceptionHandler {

        @ExceptionHandler(ObjctNotFoundException.class)
        public ResponseEntity<StandardError> objectNotFound(ObjctNotFoundException er, HttpServletRequest request) {

            StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), er.getMessage(), System.currentTimeMillis());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

        }
    }
