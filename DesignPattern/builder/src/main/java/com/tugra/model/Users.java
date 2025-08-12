package com.tugra.model;

public class Users {

    private String username;

    private String ad;

    private String email;

    private Integer yas;

    private Users(UserBuilder builder) {
        this.username = builder.username;
        this.ad = builder.ad;
        this.email = builder.email;
        this.yas = builder.yas;
    }

    public String getFirstName() {
        return username;
    }

    public String getLastName() {
        return ad;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return yas;
    }

    public static class UserBuilder {

        private String username;
        private String ad;
        private String email;
        private int yas;

        public UserBuilder firstName(String firstName) {
            this.username = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.ad = lastName;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder age(int yas) {
            this.yas = yas;
            return this;
        }

        public Users build() {
            return new Users(this);
        }
    }

}
