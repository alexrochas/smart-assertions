import org.junit.jupiter.api.Test

class SmartAssertionsTest {

    val someTest = "By the pricking of my thumbs, Something wicked this way comes. Open, locks, Whoever knocks!"

    @Test
    fun shouldInsertExtensionMethods() {
        assertThat(someTest) {
            it isDifferentTo "?"
            it isEqualTo "By the pricking of my thumbs, Something wicked this way comes. Open, locks, Whoever knocks!"
            it.length isBiggerThan 5
        }
    }

}
