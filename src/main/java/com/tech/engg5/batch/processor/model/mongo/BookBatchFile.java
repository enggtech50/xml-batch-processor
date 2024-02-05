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
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "book_batch_file_summary")
@FieldNameConstants
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookBatchFile {
  String fileName;
  String fileCorrelationId;
  Integer retryCount;
  Integer recordCount;
  Integer failedRecordCount;
  String status;
  Instant createdTs;
  Instant lastUpdatedTs;

  public void incrementTotalRecordCount() { this.recordCount++; }
}
