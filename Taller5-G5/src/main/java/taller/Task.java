/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Date;

/**
 *
 * @author CMONTES
 */
public class Task {

    private String title;
    private Date date;
    private String status;

    public Task(String title, Date date, String status) {
        this.title = title;
        this.date = date;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return title;
    }
}
