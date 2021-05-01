# Laminar Web Components

[Laminar](https://github.com/raquo/Laminar) type definitions for web component collections. Currently included collections:

- [Google's Material Web Components](https://github.com/material-components/material-components-web-components)

## Usage

### Add dependency

Package is published to GitHub Packages in this repository. To reference it, you can use
[sbt-github-packages](https://github.com/djspiewak/sbt-github-packages) SBT plugin:

```
resolvers += Resolver.githubPackages("uosis")

libraryDependencies += "com.github.uosis" %%% "laminar-web-components-material" % "0.1.0"
```

### Ensure you have [sbt-scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/) plugin

Web Components have NPM dependencies.

### Use components in your app

Web Components have similar interface to built-in elements. See examples below.

## Examples

### Component Showcase

Displays a collection of Web Components

To run:
  - `cd examples/showcase`
  - `sbt fastOptJS::webpack`
  - Open `index-fastopt.html` in browser

Please note that since the `components` package is not yet published you first need to do this:

```
cd material
sbt publishLocal
```

Otherwise you might get an *Unresolved dependencies path* error.

## Generator

[generator](https://github.com/uosis/laminar-web-components/tree/master/generator) folder contains Ammonite scripts used to generate component type definitions. If you want to tweak the generated types, changes should be made here.

To run code generation:

- `amm generator/main.sc`
- Format `material/src/main/scala/material.scala` using scalafmt
- Check in the new generated code


### Adding new component to existing collection or modifying existing component

- Add/modify the component in the generation script
  - For example, if it's a new Google Material Web Component, add it to `material.sc` using one of the existing components as an example.
- Run code generation as described above
- Check in generated code


### Adding new component collection

- Create new definitions script using `material.sc` as an example
- Create new SBT project using `material/` project as an example
- Update `main.sc` to include new project
- Run code generation
- Check in generated code
