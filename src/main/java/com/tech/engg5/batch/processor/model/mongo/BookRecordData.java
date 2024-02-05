package com.tech.engg5.batch.processor.model.mongo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@FieldNameConstants
@Document("book-batch_file_records")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookRecordData {
  String fileCorrelationId;
  String recordCorrelationId;
  Integer recordSequenceNumber;
  String rawRecordData;
  String Status;
  Instant createdTs;
  Instant lastUpdatedTs;
}
