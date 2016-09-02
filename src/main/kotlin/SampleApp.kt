import org.apache.spark.SparkConf
import org.apache.spark.api.java.JavaSparkContext

/**
 * Kotlin version of the Apache Spark Self contained application.
 */
fun main(args: Array<String>) {

    val ansi_yellow = "\u001B[33m"
    val ansi_reset = "\u001B[0m"

    println("Loading")

    val logFile = "/opt/spark/spark/README.md" // Should be some file on your system
    val conf = SparkConf().setAppName("Simple Application")
    val sc = JavaSparkContext(conf)
    val logData = sc.textFile(logFile).cache()

    val numAs = logData.filter({ s -> s.contains("a") }).count()
    val numBs = logData.filter({ s -> s.contains("b") }).count()

    println(ansi_yellow + "Lines with a: $numAs, lines with b: $numBs" + ansi_reset)
}

