package org.rpinzon.snapper.controller;

import org.rpinzon.snapper.model.Data;
import org.rpinzon.snapper.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Renan T. Pinzon on 09/08/18.
 */
@RestController
public class DataController {

    private final DataRepository repository;

    @Autowired
    public DataController(DataRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/snapper/post", method = RequestMethod.POST)
    public void persist(@RequestBody Data data) {
        repository.save(data);
    }

}
