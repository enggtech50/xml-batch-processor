package com.tech.engg5.batch.processor.exception;

import lombok.Getter;

@Getter
public class EventParseTransformationException extends Exception {
  public EventParseTransformationException(String message, Throwable t) { super(message, t); }
}
