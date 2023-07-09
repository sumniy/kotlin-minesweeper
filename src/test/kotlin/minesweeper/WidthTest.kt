package minesweeper

import io.kotest.assertions.throwables.shouldThrow
import minesweeper.domain.Width
import org.junit.jupiter.api.Test

class WidthTest {
    @Test
    fun `width는 음수 값으로 생성 시 예외가 발생한다`() {
        shouldThrow<IllegalArgumentException> { Width(0) }
    }
}
