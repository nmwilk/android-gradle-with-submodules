# AndroidGradleWithSubmodules
Shows sample Android app set up with Gradle using a submodule (which could be a git submodule).

Submodule has two further modules, one Java, one Android. The Android module depends on the Java module, this is configured in the
submodule's settings.gradle. The means that the main Android app only needs to depend on the Android module.

Both modules in the submodule have unit tests. The plain Java one uses JUnit4, the Android one uses JUnit3.
