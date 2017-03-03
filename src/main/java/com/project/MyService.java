package com.project;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MyService {
  private final MyComponent myComponent;

  public void doWork() {
    myComponent.doWork();
  }
}
