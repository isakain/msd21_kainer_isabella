# Exercise 5

## Why do we use logging libraries?
We need logging libraries to track the flow of our program. Without logging libraries we would have to simply use print statements for the console to log the flow, but this way of logging becomes chaotic very easily.

## Which log level do exist and how do they work?
* **ALL**: logs all events
* **TRACE**: logs a special type of debug message which captures the flow of the application
* **DEBUG**: logs a debugging event
* **INFO**: logs an event for informational purposes
* **WARN**: logs an event that might lead to an error
* **ERROR**: logs an error in the application that might be recoverable
* **FATAL**: logs a sever error that stops the application

In a configuration file we can specify which log levels we want to include into our log file. Therefore we mention one log level --> this log level and all log level above from it will be logged.

**Order of log levels:** ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL

## Which possibilities for configuration do exist for log4J?
You can configure the Appenders, they are responsible for writing the logs to the right destination (e.g. a specific file or the console).
You can also configure the Logger by specifying which log level should be included for a specific Appender.