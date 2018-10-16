package com.example.task.service;

import com.example.task.entity.Number;
import com.example.task.repository.SmallLargeAverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmallLargeAverageService {
@Autowired
    SmallLargeAverageRepository smallLargeAverageRepository;
    public void saveNumber(Float number) {
            Number numberToSave = new Number(number);
            smallLargeAverageRepository.save(numberToSave);
    }

    public Float getSmallestNumber() {
        List<Float> smallestNumber;
       smallestNumber = smallLargeAverageRepository.findSmallestNumber();
       return smallestNumber.get(0);
    }

    public Float getLargestNumber() {
        List<Float>  largestNumber;
        largestNumber = smallLargeAverageRepository.findLargestNumber();
        return largestNumber.get(0);
    }

    public Float getAverageOfNumber() {
        Float averageOfNumbers;
        averageOfNumbers=smallLargeAverageRepository.findAverageNumbers();
        return averageOfNumbers;
    }
}
