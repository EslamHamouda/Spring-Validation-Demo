package com.example.validationdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePre;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePre = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (s!=null){
            result = s.startsWith(coursePre);
        }
        else {
            result = true;
        }
        return result;
    }
}
