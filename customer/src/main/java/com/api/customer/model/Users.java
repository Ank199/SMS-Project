package com.api.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    private Long accountId;
    private String username;
    private String password;
    public Long getAccountId() {
        return accountId;
    }
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
    public Users(Long accountId, String username, String password) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;

    }
    public Users() {
    }
    @Override
    public String toString() {
        return "Users [accountId=" + accountId + ", username=" + username + ", password=" + password
                + ", getAccountId()=" + getAccountId() + ", getUsername()=" + getUsername() + ", getPassword()="
                + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    
    
}
