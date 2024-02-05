package com.tech.engg5.batch.processor.model.properties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sft {
  String hostName;
  String userName;
  String secretKey;
  String directoryPath;
  int portNumber;
  long timeout;
}
