import com.github.senin24.ArrayString
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ArrayStringTest {

    @Test
    fun task1071() {
        assertEquals("ABC", ArrayString().task1071("ABCABC", "ABC"))
        assertEquals("AB", ArrayString().task1071("ABABAB", "ABAB"))
        assertEquals("", ArrayString().task1071("LEET", "CODE"))
    }
}