package com.heladeriaapilia.api.exception;

import com.heladeriaapilia.service.BusinessLogicException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
  
   @ExceptionHandler(BusinessLogicException.class)
   public ResponseEntity<Object> handleBusinessLogicException(BusinessLogicException e) {
       Map<String, String> errorMap = new HashMap<>();
       errorMap.put("message", e.getMessage());
       return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
   }
}