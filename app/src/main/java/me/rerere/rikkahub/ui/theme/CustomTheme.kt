package me.rerere.rikkahub.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import kotlinx.serialization.Serializable
import kotlin.uuid.Uuid

@Serializable
data class CustomTheme(
    val id: String = Uuid.random().toString(),
    val name: String = "",
    val primaryColorArgb: Long = 0xFF6750A4,
    val secondaryColorArgb: Long? = null,
    val tertiaryColorArgb: Long? = null,
) {
    fun generateColorScheme(dark: Boolean): ColorScheme {
        val primary = Color(primaryColorArgb)
        val secondary = Color((secondaryColorArgb ?: primaryColorArgb).toInt())
        val tertiary = Color((tertiaryColorArgb ?: secondaryColorArgb ?: primaryColorArgb).toInt())

        return if (dark) {
            darkColorScheme(
                primary = primary,
                secondary = secondary,
                tertiary = tertiary,
            )
        } else {
            lightColorScheme(
                primary = primary,
                secondary = secondary,
                tertiary = tertiary,
            )
        }
    }
}
