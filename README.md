# banana

This repository is just me trying out annotation processing in Java & Android.
I've been reading the [ButterKnife] source code and wanted to understand it a bit better.
This is just for learning purposes and will not be extended further.

[ButterKnife]: https://github.com/JakeWharton/butterknife

## You might find it useful if...

...if you're looking for a very simple example of

* defining an annotation
* source-level annotation processing
* project setup with `android-apt`

The code replicates the super-simple ButterKnife use case of:

```java
@BindView(R.id.label) TextView label;
```

## Overview

The project is split into 3 modules:

* `annotation` is the base module, to be used as a runtime dependency of your project
  * defines the `@BindView` annotation type
  * defines the `Banana.bind` method which invokes the binding
* `processor` is the annotation processor
* `sample` is a simple Android app demonstrating the use
