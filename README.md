<p align="center">
<a href="https://github.com/IroriPowered/hytale-mod-template/actions/workflows/build.yml"><img src="https://github.com/IroriPowered/hytale-mod-template/actions/workflows/build.yml/badge.svg" alt="Build"/></a>
</p>

# Hytale Mod Template
A simple, single-project (opinionated) template to quickstart creating Hytale mods.

## This template uses
- [Gradle Build Tool](https://gradle.org/) (Kotlin DSL)
- [Spotless](https://github.com/diffplug/spotless) ([Palantir Java Format](https://github.com/palantir/palantir-java-format))
- [Shadow](https://github.com/GradleUp/shadow)
- Hytale Server (from the official Maven repository)

## Getting started
1. Click "Use this template" on GitHub and create a new repository, or clone this repository.
2. Update the `mod_group` and `mod_version` in `gradle.properties` to match your mod.
3. Update `src/main/resources/manifest.json` with your mod metadata.
4. Rename `cc.irori.template` package to a different namespace.
5. Configure build scripts as needed.

## Project layout
- `src/main/java` contains your mod source code.
- `src/main/resources/manifest.json` holds mod metadata used by the server.
- `build.gradle.kts` configures dependencies, shadowing, and formatting.
- `libs.versions.toml` manages dependency versions including Hytale itself.

## Building
Run a clean build (also formats with Spotless if configured in the build):
```bash
./gradlew clean build
```

## Formatting
Apply formatting rules:
```bash
./gradlew spotlessApply
```
