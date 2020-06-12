This is a sample of using Dagger Hilt in a multi-module project.

https://github.com/google/dagger/issues/1865

But, unfortunately, Dagger Hilt doesn't work with Dynamic Feature Modules.
Therefore, [DfmHiltActivity](dynamic_feature/src/main/java/com/example/hilt_dfm/dynamic_feature/DfmHiltActivity.kt)
will crash with a `ClassCastException`.
In Dynamic Feature Modules, you still need to plain Dagger like
[DfmDaggerActivity](dynamic_feature/src/main/java/com/example/hilt_dfm/dynamic_feature/DfmDaggerActivity.kt).

cf. https://developer.android.com/training/dependency-injection/hilt-multi-module#dfm
