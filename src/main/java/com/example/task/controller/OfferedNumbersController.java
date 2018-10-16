package com.example.task.controller;


import com.example.task.dto.SmallLargeAverageDTO;
import com.example.task.service.SmallLargeAverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
public class OfferedNumbersController {

@Autowired
SmallLargeAverageService smallLargeAverageService;


@GetMapping(value = {"/give_number"})
    public ResponseEntity<SmallLargeAverageDTO> saveNumber(@Param("number")Float number){
    SmallLargeAverageDTO smallLargeAverageDTO = null;
    try {
        Float smallest,largest,average;
            smallLargeAverageService.saveNumber(number);
        smallest = smallLargeAverageService.getSmallestNumber();
        largest  = smallLargeAverageService.getLargestNumber();
        average  = smallLargeAverageService.getAverageOfNumber();
         smallLargeAverageDTO = new SmallLargeAverageDTO(smallest,largest,average);
        }catch (Exception e){
            return new ResponseEntity<SmallLargeAverageDTO>(smallLargeAverageDTO,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<SmallLargeAverageDTO>(smallLargeAverageDTO,HttpStatus.OK);
    }
    @GetMapping(value = {"/get_smallest_number"})
    public ResponseEntity<String> getSmalestNumber(){

        Float result = smallLargeAverageService.getSmallestNumber();

        return result==null?new ResponseEntity<String>("there's no numbers",HttpStatus.BAD_REQUEST):
                            new ResponseEntity<String>("smallest number: "+result,HttpStatus.OK);
    }
    @GetMapping(value = {"/get_largest_number"})
    public ResponseEntity<String> getLargestNumber(){

        Float result = smallLargeAverageService.getLargestNumber();

        return result==null?new ResponseEntity<String>("there's no numbers",HttpStatus.BAD_REQUEST):
                new ResponseEntity<String>("largest number: "+result,HttpStatus.OK);
    }
    @GetMapping(value = {"/get_average_of_numbers"})
    public ResponseEntity<String> getAverageOfNumbers(){

        Float result = smallLargeAverageService.getAverageOfNumber();

        return result==null?new ResponseEntity<String>("average: " + 0,HttpStatus.BAD_REQUEST):
                new ResponseEntity<String>("average of numbers: "+result,HttpStatus.OK);
    }
}
