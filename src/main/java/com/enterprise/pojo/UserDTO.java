package com.enterprise.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class UserDTO {
    private Long customerId;
    private String firstName;
    private String lastName;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = Long.valueOf(customerId);
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



//    private String username;
//    private Authority authority;
//    private ProfileDto profile;
//    private List<AttachmentLogDTO> attachments;
//    private Channel channel;


}
