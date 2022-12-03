package day3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CharKtTest {
    @Test
    fun testPoints() {
        assertEquals(1, 'a'.priority())
        assertEquals(26, 'z'.priority())
        assertEquals(27, 'A'.priority())
        assertEquals(52, 'Z'.priority())
    }
}