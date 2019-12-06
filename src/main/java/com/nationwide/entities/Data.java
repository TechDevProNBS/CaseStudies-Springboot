package com.nationwide.entities;

import javax.persistence.*;

@Entity
@Table(name="tdp_table")
public class Data {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String stream;
    private String background;
    private String maintext;
    private String email;
    private String facebook;
    private String linkedin;
    private String twitter;
    //private String phoneNumber;
    //private String area;
     private String startdate;
    //private String programme;
    //private String internalExternal;
    //private String jobTitle;
    //private String locationDescription;
    //private String locationAddress;
    //private String districtCode;
    //This corresponds to district description:
    private String currentrole;
    //private String areaCode;
    //private String departmentDescription;
    private String photo;

    public Data(String name, String stream, String background, String maintext, String email, String facebook, String linkedin, String twitter, String startdate, String currentrole, String photo){
        this.name = name;
        this.stream = stream;
        this.background = background;
        this.maintext = maintext;
        this.email = email;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.twitter = twitter;
        //this.phoneNumber = phoneNumber;
        //this.area = area;
        this.startdate = startdate;
//        this.programme = programme;
//        this.internalExternal = internalExternal;
//        this.jobTitle = jobTitle;
//        this.locationDescription = locationDescription;
//        this.locationAddress = locationAddress;
//        this.districtCode = districtCode;
        this.currentrole = currentrole;
//        this.areaCode = areaCode;
//        this.departmentDescription = departmentDescription;
        this.photo = photo;
    }

    public Data(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getArea() {
//        return area;
//    }
//
//    public void setArea(String area) {
//        this.area = area;
//    }

    public String getJoinDate() {
        return startdate;
    }

    public void setJoinDate(String joinDate) {
        this.startdate = joinDate;
    }

//    public String getProgramme() {
//        return programme;
//    }
//
//    public void setProgramme(String programme) {
//        this.programme = programme;
//    }
//
//    public String getInternalExternal() {
//        return internalExternal;
//    }
//
//    public void setInternalExternal(String internalExternal) {
//        this.internalExternal = internalExternal;
//    }
//
//    public String getJobTitle() {
//        return jobTitle;
//    }
//
//    public void setJobTitle(String jobTitle) {
//        this.jobTitle = jobTitle;
//    }
//
//    public String getLocationDescription() {
//        return locationDescription;
//    }
//
//    public void setLocationDescription(String locationDescription) {
//        this.locationDescription = locationDescription;
//    }
//
//    public String getLocationAddress() {
//        return locationAddress;
//    }
//
//    public void setLocationAddress(String locationAddress) {
//        this.locationAddress = locationAddress;
//    }
//
//    public String getDistrictCode() {
//        return districtCode;
//    }
//
//    public void setDistrictCode(String districtCode) {
//        this.districtCode = districtCode;
//    }

    public String getCurrentrole() {
        return currentrole;
    }

    public void setCurrentrole(String currentrole) {
        this.currentrole = currentrole;
    }

//    public String getAreaCode() {
//        return areaCode;
//    }
//
//    public void setAreaCode(String areaCode) {
//        this.areaCode = areaCode;
//    }
//
//    public String getDepartmentDescription() {
//        return departmentDescription;
//    }
//
//    public void setDepartmentDescription(String departmentDescription) {
//        this.departmentDescription = departmentDescription;
//    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
