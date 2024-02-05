package com.tech.engg5.batch.processor.model.properties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class S3 {
  String accessKey;
  String secretKey;
  String endpoint;
  String region;
  String bookRawBucket;
  String bookExtractBucket;
  boolean disableCertCheck;
  Integer bufferSize;
  int socketTimeout;
  int connectionTimeout;
}
