package com.hsa.nginx.cache.tuning.service;

import java.io.IOException;
import java.time.Instant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

@Service
@Slf4j
public class ImageService {

  public byte[] getImage() throws IOException {
    log.info("Get bear image at {}", Instant.now().toString());
    var imgFile = new ClassPathResource("bear.png");
    return StreamUtils.copyToByteArray(imgFile.getInputStream());
  }

}
