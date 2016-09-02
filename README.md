# Kotlin version of the Apache Spark Self contained application

[As per](http://spark.apache.org/docs/latest/quick-start.html#self-contained-applications)

## Build 
```
gw clean shadow
```

## Run with (./bin/spark-submit.)
```
YOUR_SPARK_HOME/bin/spark-submit \
    --class "SampleAppKt" \
    --master local[4] \
    build/libs/hello-spark-1.0-SNAPSHOT-all.jar   
```

