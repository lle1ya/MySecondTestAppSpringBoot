package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.shvyrkov.MySecondTestAppSpringBoot.model.Responce;
import ru.shvyrkov.MySecondTestAppSpringBoot.util.DataTimeUtil;

import java.util.Date;

@Service
@Qualifier("ModifySystemTimeResponceService")
public class ModifySystemTimeResponceService implements ModifyResponceService {
    @Override
    public Responce modify(Responce responce) {
        responce.setSystemTime(DataTimeUtil.getCustomFormat()
                .format(new Date()));
        return responce;
    }
}
