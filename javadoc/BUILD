java_binary(
    name = "hello-world",
    srcs = glob(["src/main/java/com/bmuschko/**/*.java"]),
    main_class = "com.bmuschko.HelloWorld",
)

load("//rules:javadoc.bzl", "javadoc")
 
javadoc(
    name = "api-docs",
    srcs = glob(["src/main/java/com/bmuschko/**/*.java"]),
)