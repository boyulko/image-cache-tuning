package com.hsa.nginx.cache.tuning.api;

import static org.springframework.http.HttpStatus.ACCEPTED;

import com.hsa.nginx.cache.tuning.service.ImageService;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ImageResource {

  @Autowired
  private ImageService service;

  @GetMapping("/images")
  public ResponseEntity<byte[]> getImages() throws IOException {
    return ResponseEntity.ok(service.getImage());
  }

}
