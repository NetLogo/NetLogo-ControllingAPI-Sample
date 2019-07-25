This repo contains some complete samples of using the NetLogo Controlling API through Scala.

You can check dependency setup in `build.sbt`.  You can see an example of using the NetLogo GUI through the API to load and run a model for 500 ticks in `SampleGUI.scala`.  And you can see the same example but running NetLogo headlessly with `SampleHeadless.scala`.

## Compiling and Running

To compile you'll need a recent version of SBT installed and available on your path.  It should handle grabbing the exact version from `project/build.properties` when you run it in the repo.

Once you have an SBT console running, you can compile with `compile` and run the samples with `runMain SampleHeadless` or `runMain SampleGUI`.
