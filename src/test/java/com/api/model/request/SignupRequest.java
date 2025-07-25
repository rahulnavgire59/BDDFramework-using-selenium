package com.api.model.request;

public class SignupRequest {

    public String username;
    public String password;
    public String email;
    public String firstName;
    public String lastName;
    public String mobileNumber;

    public SignupRequest(String username, String password, String email, String firstName, String lastName, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "SignupRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    //builder design pattern
    public static class Builder{
        public String username;
        public String password;
        public String email;
        public String firstName;
        public String lastName;
        public String mobileNumber;

        public Builder userName(String username){
            this.username=username;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Builder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        public Builder mobileNumber(String mobileNumber){
            this.mobileNumber=mobileNumber;
            return this;
        }

        public SignupRequest build(){
            return new SignupRequest(username,password,email,firstName,lastName,mobileNumber);
        }

    }

}
