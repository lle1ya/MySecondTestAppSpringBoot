package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.shvyrkov.MySecondTestAppSpringBoot.model.Responce;

@Service
public interface ModifyResponceService {
    Responce modify(Responce responce);
}
