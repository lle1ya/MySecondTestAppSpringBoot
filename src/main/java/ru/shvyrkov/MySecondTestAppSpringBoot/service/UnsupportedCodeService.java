package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.shvyrkov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.shvyrkov.MySecondTestAppSpringBoot.exception.ValidationFailedException;

@Service
public interface UnsupportedCodeService {
    void isSupported(int uid) throws UnsupportedCodeException;
}
