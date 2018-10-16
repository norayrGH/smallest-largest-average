package com.example.task.dto;

public class SmallLargeAverageDTO {
    private Float smallest;
    private Float largest;
    private Float average;

    public SmallLargeAverageDTO() {
    }

    public SmallLargeAverageDTO(Float smallest, Float largest, Float average) {
        this.smallest = smallest;
        this.largest = largest;
        this.average = average;
    }

    public Float getSmallest() {
        return smallest;
    }

    public void setSmallest(Float smallest) {
        this.smallest = smallest;
    }

    public Float getLargest() {
        return largest;
    }

    public void setLargest(Float largest) {
        this.largest = largest;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }
}
