package com.example.lab7.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }

    @GetMapping
    public List<FlowerPack> getFlower() {
        List<FlowerPack> flowerPack = List.of(new FlowerPack[]{new FlowerPack(new Flower("red", 2, 12), 5)});
        return flowerPack;
    }
}
