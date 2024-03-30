package org.levi.apicdc.apicdc.newinstance;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewInstanceController {

    private final InstanceService service;

    public NewInstanceController(InstanceService service) {
        this.service = service;
    }

    @PostMapping(value = "/book/{isbn}/instances")
    public ResponseEntity<?> createInstance(@PathVariable String isbn,
                                            @Valid @RequestBody NewInstanceRequest request) {

        return new ResponseEntity<>(this.service.createInstance(isbn, request), HttpStatus.CREATED);
    }
}
