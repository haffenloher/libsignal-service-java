/**
 * Copyright (C) 2014-2017 Open Whisper Systems
 *
 * Licensed according to the LICENSE file in this repository.
 */

package org.whispersystems.signalservice.api.push.exceptions;

public class RateLimitExceededException extends Exception {

  private final String e164number;

  public RateLimitExceededException(String e164number, Exception nested) {
    super(nested);
    this.e164number = e164number;
  }

  public String getE164number() {
    return e164number;
  }
}
