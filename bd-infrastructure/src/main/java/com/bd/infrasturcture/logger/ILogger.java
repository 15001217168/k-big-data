package com.bd.infrasturcture.logger;

import java.util.concurrent.FutureTask;

public interface ILogger {
    void LogInfo(String info);
    void LogException(Exception ex);
    FutureTask LogInfoAsync(String info);
    FutureTask LogExceptionAsync(Exception ex);
}
