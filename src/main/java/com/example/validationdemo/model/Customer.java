package com.example.validationdemo.model;

import com.example.validationdemo.validation.CourseCode;
import com.example.validationdemo.validation.CourseCodeConstraintValidator;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "More than 0")
    @Max(value = 10, message = "More than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public Customer(){}

    public Customer(String firstName, String lastName, Integer freePasses, String postalCode, String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
        this.postalCode = postalCode;
        this.courseCode = courseCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName) {
        this.lastName = lastName;
    }

    public @Min(value = 0, message = "More than 0") @Max(value = 10, message = "More than 10") Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(@Min(value = 0, message = "More than 0") @Max(value = 10, message = "More than 10") Integer freePasses) {
        this.freePasses = freePasses;
    }

    public @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits") String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
