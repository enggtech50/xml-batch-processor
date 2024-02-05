package com.tech.engg5.batch.processor.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BatchFileNameUtility {

  public static String getExtractFileName(String zipFileName) {
    int index = zipFileName.lastIndexOf('.');
    return zipFileName.substring(0, index);
  }

  public static String getFileCorrelationId(String fileName) {
    int startIndex = fileName.lastIndexOf('_');
    int endIndex = fileName.indexOf('-');
    return fileName.substring(startIndex + 1, endIndex + 7);
  }
}
