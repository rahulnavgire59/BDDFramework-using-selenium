package com.api.model.request;

public class profileRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public profileRequest(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "profileRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static class Builder{
        public String firstName;
        public String lastName;
        public String email;
        public String mobileNumber;

        public Builder firstName(String firstName){
            this.firstName =firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName =lastName;
            return this;
        }
        public Builder email(String email){
            this.email =email;
            return this;
        }
        public Builder mobileNumber(String mobileNumber){
            this.mobileNumber =mobileNumber;
            return this;
        }

        public profileRequest build(){
            profileRequest profilereq= new profileRequest(firstName,lastName,email,mobileNumber);
            return profilereq;
        }
    }


}
