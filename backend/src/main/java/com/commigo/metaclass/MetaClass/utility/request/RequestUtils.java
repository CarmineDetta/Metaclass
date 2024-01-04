package com.commigo.metaclass.MetaClass.utility.request;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.stream.Collectors;

public class RequestUtils {

    public static String errorsRequest(BindingResult result){
        List<String> errors = result.getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.toList());
        return String.join(", ", errors);
    }

}