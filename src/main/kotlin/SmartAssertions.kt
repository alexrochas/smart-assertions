import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers

fun <T> assertThat(obj: T, block: AssertExtensions.(T) -> Unit) {
    with(AssertExtensions) {
        block(obj)
    }
}

object AssertExtensions {
    infix fun <T> T.isEqualTo(o: T) {
        MatcherAssert.assertThat<T>(o, Matchers.equalTo(this))
    }

    infix fun <T> T.isDifferentTo(o: T) {
        MatcherAssert.assertThat<T>(o, Matchers.not(Matchers.equalTo(this)))
    }

    infix fun <T: Comparable<T>> T.isBiggerThan(o: T) {
        MatcherAssert.assertThat<T>(o, Matchers.lessThan(this))
    }
}
