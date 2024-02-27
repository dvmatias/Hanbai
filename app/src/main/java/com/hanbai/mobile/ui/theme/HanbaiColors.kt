package com.hanbai.mobile.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Stable
class HanbaiColors(
    backgroundPrimary: Color,
    backgroundSecondary: Color,
    backgroundDisabled: Color,
    backgroundInverse: Color,
    backgroundAccent: Color,
    backgroundAttention: Color,
    backgroundSuccess: Color,
    foregroundPrimary: Color,
    foregroundSecondary: Color,
    foregroundDisabled: Color,
    foregroundAccent: Color,
    foregroundAttention: Color,
    foregroundSuccess: Color
) {
    var backgroundPrimary by mutableStateOf(backgroundPrimary)
        private set
    var backgroundSecondary by mutableStateOf(backgroundSecondary)
        private set
    var backgroundDisabled by mutableStateOf(backgroundDisabled)
        private set
    var backgroundInverse by mutableStateOf(backgroundInverse)
        private set
    var backgroundAccent by mutableStateOf(backgroundAccent)
        private set
    var backgroundAttention by mutableStateOf(backgroundAttention)
        private set
    var backgroundSuccess by mutableStateOf(backgroundSuccess)
        private set
    var foregroundPrimary by mutableStateOf(foregroundPrimary)
        private set
    var foregroundSecondary by mutableStateOf(foregroundSecondary)
        private set
    var foregroundDisabled by mutableStateOf(foregroundDisabled)
        private set
    var foregroundAccent by mutableStateOf(foregroundAccent)
        private set
    var foregroundAttention by mutableStateOf(foregroundAttention)
        private set
    var foregroundSuccess by mutableStateOf(foregroundSuccess)
        private set

    fun copy() = HanbaiColors(
        backgroundPrimary = backgroundPrimary,
        backgroundSecondary = backgroundSecondary,
        backgroundDisabled = backgroundDisabled,
        backgroundInverse = backgroundInverse,
        backgroundAccent = backgroundAccent,
        backgroundAttention = backgroundAttention,
        backgroundSuccess = backgroundSuccess,
        foregroundPrimary = foregroundPrimary,
        foregroundSecondary = foregroundSecondary,
        foregroundDisabled = foregroundDisabled,
        foregroundAccent = foregroundAccent,
        foregroundAttention = foregroundAttention,
        foregroundSuccess = foregroundSuccess
    )

    fun update(other: HanbaiColors) = other.also {
        HanbaiColors(
            backgroundPrimary = backgroundPrimary,
            backgroundSecondary = backgroundSecondary,
            backgroundDisabled = backgroundDisabled,
            backgroundInverse = backgroundInverse,
            backgroundAccent = backgroundAccent,
            backgroundAttention = backgroundAttention,
            backgroundSuccess = backgroundSuccess,
            foregroundPrimary = foregroundPrimary,
            foregroundSecondary = foregroundSecondary,
            foregroundDisabled = foregroundDisabled,
            foregroundAccent = foregroundAccent,
            foregroundAttention = foregroundAttention,
            foregroundSuccess = foregroundSuccess
        )
    }
}

internal val lightHanbaiColors = HanbaiColors(
    backgroundPrimary = B0,
    backgroundSecondary = B1,
    backgroundDisabled = B3,
    backgroundInverse = B6,
    backgroundAccent = Color(0xFFFF9800),
    backgroundAttention = Color(0xFFFF9800),
    backgroundSuccess = Color(0xFFFF9800),
    foregroundPrimary = B7,
    foregroundSecondary = B5,
    foregroundDisabled = B3,
    foregroundAccent = Color(0xFFFF9800),
    foregroundAttention = Color(0xFFFF9800),
    foregroundSuccess = Color(0xFFFF9800)
)

internal val darkHanbaiColors = HanbaiColors(
    backgroundPrimary = B8,
    backgroundSecondary = B7,
    backgroundDisabled = B5,
    backgroundInverse = B2,
    backgroundAccent = Color(0xFFFF9800),
    backgroundAttention = Color(0xFFFF9800),
    backgroundSuccess = Color(0xFFFF9800),
    foregroundPrimary = B1,
    foregroundSecondary = B4,
    foregroundDisabled = B5,
    foregroundAccent = Color(0xFFFF9800),
    foregroundAttention = Color(0xFFFF9800),
    foregroundSuccess = Color(0xFFFF9800)
)

internal fun getColorScheme(colorScheme: HanbaiColors): ColorScheme =
    ColorScheme(
        primary = colorScheme.backgroundPrimary,
        onPrimary = colorScheme.backgroundPrimary,
        primaryContainer = colorScheme.backgroundPrimary,
        onPrimaryContainer = colorScheme.backgroundPrimary,
        inversePrimary = colorScheme.backgroundPrimary,
        secondary = colorScheme.backgroundPrimary,
        onSecondary = colorScheme.backgroundPrimary,
        secondaryContainer = colorScheme.backgroundPrimary,
        onSecondaryContainer = colorScheme.backgroundPrimary,
        tertiary = colorScheme.backgroundPrimary,
        onTertiary = colorScheme.backgroundPrimary,
        tertiaryContainer = colorScheme.backgroundPrimary,
        onTertiaryContainer = colorScheme.backgroundPrimary,
        background = colorScheme.backgroundPrimary,
        onBackground = colorScheme.backgroundPrimary,
        surface = colorScheme.backgroundPrimary,
        onSurface = colorScheme.backgroundPrimary,
        surfaceVariant = colorScheme.backgroundPrimary,
        onSurfaceVariant = colorScheme.backgroundPrimary,
        surfaceTint = colorScheme.backgroundPrimary,
        inverseSurface = colorScheme.backgroundPrimary,
        inverseOnSurface = colorScheme.backgroundPrimary,
        error = colorScheme.backgroundPrimary,
        onError = colorScheme.backgroundPrimary,
        errorContainer = colorScheme.backgroundPrimary,
        onErrorContainer = colorScheme.backgroundPrimary,
        outline = colorScheme.backgroundPrimary,
        outlineVariant = colorScheme.backgroundPrimary,
        scrim = colorScheme.backgroundPrimary,
    )