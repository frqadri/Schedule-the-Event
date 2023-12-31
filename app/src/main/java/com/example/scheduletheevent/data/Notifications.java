package com.example.scheduletheevent.data;

public class Notifications {
    private String hall_name;
    private String msg_title;
    private String msg_description;
    private String msg_time;
    private String img_url;

    public Notifications(String hall_name, String msg_title, String msg_description, String msg_time, String img_url) {
        this.hall_name = hall_name;
        this.msg_title = msg_title;
        this.msg_description = msg_description;
        this.msg_time = msg_time;
        this.img_url = img_url;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public String getMsg_title() {
        return msg_title;
    }

    public void setMsg_title(String msg_title) {
        this.msg_title = msg_title;
    }

    public String getMsg_description() {
        return msg_description;
    }

    public void setMsg_description(String msg_description) {
        this.msg_description = msg_description;
    }

    public String getMsg_time() {
        return msg_time;
    }

    public void setMsg_time(String msg_time) {
        this.msg_time = msg_time;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
