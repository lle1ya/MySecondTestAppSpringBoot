package ru.shvyrkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.shvyrkov.MySecondTestAppSpringBoot.model.Positions;
import ru.shvyrkov.MySecondTestAppSpringBoot.util.LeapYearUtil;

import java.time.LocalDate;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {
        return salary * bonus * LeapYearUtil.isLeapYear() * positions.getPositionsCoefficient() / workDays;
    }
    public double calculateQuarterlyBonus(Positions positions, double salary) {
        if (!positions.isManager()) {
            throw new IllegalArgumentException("Премия может быть рассчитана только для менеджеров и управленцев.");
        }
        return salary * 0.25;
    }
}
