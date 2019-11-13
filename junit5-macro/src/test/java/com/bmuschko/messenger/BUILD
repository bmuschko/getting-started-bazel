load("//macros:junit5.bzl", "java_junit5_test")

java_junit5_test(
    name = "messenger-test",
    srcs = [
        "MessengerTest.java"
    ],
    test_package = "com.bmuschko.messenger",
    deps = [
        "//src/main/java/com/bmuschko/messenger:messenger-lib"
    ],
)