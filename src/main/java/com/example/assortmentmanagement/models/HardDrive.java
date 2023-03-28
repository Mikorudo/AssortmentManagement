package com.example.assortmentmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class HardDrive extends Product{
    private long diskCapacity;

    public HardDrive() {
        this.diskCapacity = 0;
    }

    public HardDrive(String name, int serialNum, String manufacturer, int number, long diskCapacity) {
        super(name, serialNum, manufacturer, number);
        this.diskCapacity = diskCapacity;
    }

    public long getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(long diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "diskCapacity=" + diskCapacity +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", manufacturer='" + manufacturer + '\'' +
                ", number=" + number +
                '}';
    }
}
