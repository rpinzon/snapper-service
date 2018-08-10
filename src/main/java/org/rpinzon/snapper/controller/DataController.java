package org.rpinzon.snapper.controller;

import org.rpinzon.snapper.model.Data;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Renan T. Pinzon on 09/08/18.
 */
@RestController
public class DataController {

    @RequestMapping(value = "/snapper", method = RequestMethod.POST)
    public void persist(@RequestBody Data data) {
        System.out.println(data);
    }

}
