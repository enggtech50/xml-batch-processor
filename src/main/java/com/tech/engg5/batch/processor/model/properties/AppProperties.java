package com.tech.engg5.batch.processor.model.properties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@ConfigurationProperties("book-batch-processor")
public class AppProperties {
  S3 s3;
  Source src;
  Destination dst;
  Sft sft;
  Runner runner;
  Runner fileReprocessRunner;
  Runner recordReprocessRunner;
}
