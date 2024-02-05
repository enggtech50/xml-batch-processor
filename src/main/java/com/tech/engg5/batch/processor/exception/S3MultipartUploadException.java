package com.tech.engg5.batch.processor.exception;

public class S3MultipartUploadException extends RuntimeException {
  public S3MultipartUploadException() { super(); }

  public S3MultipartUploadException(String message, Throwable t) { super(message, t); }
}
