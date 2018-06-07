# Lottie DFW Android Test
Native Android animation using the library [Lottie from Airbnb](https://github.com/airbnb/lottie-android)

![snapshot](https://user-images.githubusercontent.com/2035397/41127919-42ea6c24-6a61-11e8-80e7-5a0583005bf3.gif)

## Overview

[Adobe After Effects](http://www.adobe.com/products/aftereffects.html) animations can, with the use of the [bodymovin](https://github.com/bodymovin/bodymovin) plugin, be exported as JSON parsed by [Lottie](https://github.com/airbnb/lottie-android), a library for Android that renders vector animation natively.

## Alternative ([AnimatedVectorDrawableTest repo](https://github.com/domingl/AnimatedVectorDrawableTest))

Non-core animations such as gradient require the use of Lottie.

Core animations (opacity, paths, solid fills etc.) could gain a performance improvement when using [AnimatedVectorDrawable](https://developer.android.com/reference/android/graphics/drawable/AnimatedVectorDrawable.html). Starting from API 25, AnimatedVectorDrawable runs on RenderThread as opposed to on UI thread, meaning animations remain smooth even when there is heavy UI thread workload.

## Built With

* [Adobe After Effects](http://www.adobe.com/products/aftereffects.html)
* [bodymovin](https://github.com/bodymovin/bodymovin)
* [Lottie](https://github.com/airbnb/lottie-android)

## Related

* [The Airbnb Tool That's Changing UI Design](https://www.fastcodesign.com/90137495/the-airbnb-tool-thats-changing-ui-design) - Uber, Google, Instacart, and others are all adopting Airbnb's prototyping tool, Lottie.
* [The Future of Lottie](https://airbnb.design/the-future-of-lottie/) - Our community-driven vision for our animation tool.
