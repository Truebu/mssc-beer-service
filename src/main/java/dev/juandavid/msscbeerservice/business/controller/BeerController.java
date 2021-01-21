package dev.juandavid.msscbeerservice.business.controller;

import dev.juandavid.msscbeerservice.model.dto.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Validated
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@NotNull @PathVariable("beerId")UUID beerId){
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@NotNull @Valid @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public  ResponseEntity updateBeerById(@NotNull @PathVariable("beerId") UUID beerId,@NotNull @Valid @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
