package com.hanbai.mobile.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

object HanbaiTheme {
    val colors: HanbaiColors
        @Composable
        @ReadOnlyComposable
        get() = localHanbaiColors.current
}

private val localHanbaiColors = staticCompositionLocalOf<HanbaiColors> {
    error("No HanbaiColors provided")
}

@Composable
fun HanbaiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    isPreview: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkHanbaiColors else lightHanbaiColors
    val hanbaiColors = remember { colors.copy() }.apply { update(colors) }

    val view = LocalView.current
    if (!view.isInEditMode && !isPreview) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colors.backgroundPrimary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = getColorScheme(colors),
        typography = Typography
    ) {
        CompositionLocalProvider(
            localHanbaiColors provides hanbaiColors,
            content = content,
        )
    }
}