package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

  private final TestRepository repository;

  public TestEntity getTestObject(long id) {
    var entity = repository.findById(id);

    return entity.orElse(null);
  }

  public TestEntity createTestObject(TestEntity entity) {
    var saved = repository.save(entity);

    return saved;
  }

  public List<TestEntity> getAll() {
    var result = repository.findAll();

    return result;
  }

  public Page<TestEntity> getBySender(String sender, Pageable page) {
    var result = repository.findAllBySender(sender, page);

    return result;
  }

}
