package com.example.task.repository;

import com.example.task.entity.Number;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmallLargeAverageRepository extends CrudRepository<Number,Long> {
    @Query(value = "Select n.number from Number n where n.number =(select min(n.number) from Number n )")
    List<Float> findSmallestNumber();
    @Query("Select n.number from Number n where n.number =(select max(n.number) from Number n )")
    List<Float> findLargestNumber();
    @Query("Select avg(n.number) from Number n")
    Float findAverageNumbers();
}
