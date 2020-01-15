import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}

lazy val root =
  crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("."))
  .settings(
    version      := "0.1-SNAPSHOT",
    scalaVersion := "2.13.1",
    name := "assignable",
    scalaJSUseMainModuleInitializer := true
  )
