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
    private String area;
    private String startdate;
    private String programme;
    private String internalexternal;
    private String locationdescription;
    private String districtdescription;
    private String photo;

    public Data(String name, String stream, String background, String maintext, String email, String facebook, String linkedin, String twitter, String area, String startdate, String programme, String internalexternal, String locationdescription, String currentrole, String districtdescription, String photo){
        this.name = name;
        this.stream = stream;
        this.background = background;
        this.maintext = maintext;
        this.email = email;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.area = area;
        this.startdate = startdate;
        this.programme = programme;
        this.internalexternal = internalexternal;
        this.locationdescription = locationdescription;
        this.districtdescription = districtdescription;
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


    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getInternalexternal() {
        return internalexternal;
    }

    public void setInternalexternal(String internalexternal) {
        this.internalexternal = internalexternal;
    }

    public String getLocationdescription() {
        return locationdescription;
    }

    public void setLocationdescription(String locationdescription) {
        this.locationdescription = locationdescription;
    }

    public String getDistrictdescription() {
        return districtdescription;
    }

    public void setDistrictdescription(String districtdescription) {
        this.districtdescription = districtdescription;
    }

    public String getJoinDate() {
        return startdate;
    }

    public void setJoinDate(String joinDate) {
        this.startdate = joinDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
