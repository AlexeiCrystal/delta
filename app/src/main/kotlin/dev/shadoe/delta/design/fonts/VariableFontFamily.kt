package dev.shadoe.delta.design.fonts

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import dev.shadoe.delta.R

// TODO: Potentially will backport app < SDK 30
@SuppressLint("ObsoleteSdkInt")
@OptIn(ExperimentalTextApi::class)
@RequiresApi(Build.VERSION_CODES.O)
internal val VariableFontFamily =
  FontFamily(
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W200,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W200.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W300,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W300.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W400,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W400.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W500,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W500.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W600,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W600.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W700,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W700.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W800,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W800.weight)),
    ),
    Font(
      R.font.nunitosans_variable,
      weight = FontWeight.W900,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W900.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W200,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W200.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W300,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W300.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W400,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W400.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W500,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W500.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W600,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W600.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W700,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W700.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W800,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W800.weight)),
    ),
    Font(
      R.font.nunitosans_italic_variable,
      weight = FontWeight.W900,
      style = FontStyle.Italic,
      variationSettings =
        FontVariation.Settings(FontVariation.weight(FontWeight.W900.weight)),
    ),
  )
