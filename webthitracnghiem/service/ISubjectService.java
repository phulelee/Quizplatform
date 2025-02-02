package com.tttn.webthitracnghiem.service;

import com.tttn.webthitracnghiem.entity.Subject;
import com.tttn.webthitracnghiem.entity.SubjectRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISubjectService {
    Iterable<Subject> findAll();
    List<Subject> getAll();
    Page<Subject> findAll(Pageable pageable);
    Page<Subject> findByNameSubject(String name, Pageable pageable);
    Subject findById(int id);
    Subject save(SubjectRequest subjectRequest);
    void remove(Subject subject);
}
