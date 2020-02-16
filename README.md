# smart assertions
> Minor proof of concept to use with Kotlin tests

## Why?

Didn't found something similar...do you know something?

## What?

A (maybe) more pragmatic way to express assertions:

```kotlin
fun main() {
    assertThat("some really fancy text") {
        it isDifferentTo "?"
        it isEqualTo "some really fancy text"
        it.length isBiggerThan 5
        ...
    }
}
```

## Where do we go from here? 

Let's copy everything we find from Hamcrest! (or even use it in behind the scenes...)

## Meta

Alex Rocha - [about.me](http://about.me/alex.rochas) -
