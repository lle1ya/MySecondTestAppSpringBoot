package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.shvyrkov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
