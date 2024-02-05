package com.tech.engg5.batch.processor.model.properties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Runner {
  String cronSchedule;
  boolean disabled;
  boolean oneOff;
}
