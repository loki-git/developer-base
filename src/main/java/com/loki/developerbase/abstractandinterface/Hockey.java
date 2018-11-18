package com.loki.developerbase.abstractandinterface;

public interface Hockey extends Football {

    void homeGoalScored();

    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);

}
