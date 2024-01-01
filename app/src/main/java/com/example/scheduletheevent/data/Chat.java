package com.example.scheduletheevent.data;

public class Chat {
    private String hall_name;
    private String message;
    private String time;
    private String profile_url;

    public Chat(String hall_name, String message, String time, String profile_url) {
        this.hall_name = hall_name;
        this.message = message;
        this.time = time;
        this.profile_url = profile_url;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }
}
