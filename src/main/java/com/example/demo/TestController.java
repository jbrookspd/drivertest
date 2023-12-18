package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

  private final TestService testService;

  @GetMapping
  public ResponseEntity<List<TestEntity>> getAllEndpoint() {

    var response = testService.getAll();

    return ResponseEntity.ok(response);
  }

  @PostMapping
  public ResponseEntity<TestEntity> createEndpoint(@RequestBody TestEntity entity) {

    var response = testService.createTestObject(entity);

    return ResponseEntity.ok(response);
  }
}
