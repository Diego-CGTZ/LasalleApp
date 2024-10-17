package com.example.lasalleapp.ui.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Password: ImageVector
    get() {
        if (_Password != null) {
            return _Password!!
        }
        _Password = ImageVector.Builder(
            name = "Password",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(46f, -242f)
                lineToRelative(-52f, -30f)
                lineToRelative(34f, -60f)
                horizontalLineTo(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(68f)
                lineToRelative(-34f, -58f)
                lineToRelative(52f, -30f)
                lineToRelative(34f, 58f)
                lineToRelative(34f, -58f)
                lineToRelative(52f, 30f)
                lineToRelative(-34f, 58f)
                horizontalLineToRelative(68f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-68f)
                lineToRelative(34f, 60f)
                lineToRelative(-52f, 30f)
                lineToRelative(-34f, -60f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-52f, -30f)
                lineToRelative(34f, -60f)
                horizontalLineToRelative(-68f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(68f)
                lineToRelative(-34f, -58f)
                lineToRelative(52f, -30f)
                lineToRelative(34f, 58f)
                lineToRelative(34f, -58f)
                lineToRelative(52f, 30f)
                lineToRelative(-34f, 58f)
                horizontalLineToRelative(68f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-68f)
                lineToRelative(34f, 60f)
                lineToRelative(-52f, 30f)
                lineToRelative(-34f, -60f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-52f, -30f)
                lineToRelative(34f, -60f)
                horizontalLineToRelative(-68f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(68f)
                lineToRelative(-34f, -58f)
                lineToRelative(52f, -30f)
                lineToRelative(34f, 58f)
                lineToRelative(34f, -58f)
                lineToRelative(52f, 30f)
                lineToRelative(-34f, 58f)
                horizontalLineToRelative(68f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-68f)
                lineToRelative(34f, 60f)
                lineToRelative(-52f, 30f)
                lineToRelative(-34f, -60f)
                close()
            }
        }.build()
        return _Password!!
    }

private var _Password: ImageVector? = null

public val Colors: ImageVector
    get() {
        if (_Colors != null) {
            return _Colors!!
        }
        _Colors = ImageVector.Builder(
            name = "Colors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(346f, 820f)
                lineTo(100f, 574f)
                quadToRelative(-10f, -10f, -15f, -22f)
                reflectiveQuadToRelative(-5f, -25f)
                reflectiveQuadToRelative(5f, -25f)
                reflectiveQuadToRelative(15f, -22f)
                lineToRelative(230f, -229f)
                lineToRelative(-106f, -106f)
                lineToRelative(62f, -65f)
                lineToRelative(400f, 400f)
                quadToRelative(10f, 10f, 14.5f, 22f)
                reflectiveQuadToRelative(4.5f, 25f)
                reflectiveQuadToRelative(-4.5f, 25f)
                reflectiveQuadToRelative(-14.5f, 22f)
                lineTo(440f, 820f)
                quadToRelative(-10f, 10f, -22f, 15f)
                reflectiveQuadToRelative(-25f, 5f)
                reflectiveQuadToRelative(-25f, -5f)
                reflectiveQuadToRelative(-22f, -15f)
                moveToRelative(47f, -506f)
                lineTo(179f, 528f)
                horizontalLineToRelative(428f)
                close()
                moveToRelative(399f, 526f)
                quadToRelative(-36f, 0f, -61f, -25.5f)
                reflectiveQuadTo(706f, 752f)
                quadToRelative(0f, -27f, 13.5f, -51f)
                reflectiveQuadToRelative(30.5f, -47f)
                lineToRelative(42f, -54f)
                lineToRelative(44f, 54f)
                quadToRelative(16f, 23f, 30f, 47f)
                reflectiveQuadToRelative(14f, 51f)
                quadToRelative(0f, 37f, -26f, 62.5f)
                reflectiveQuadTo(792f, 840f)
            }
        }.build()
        return _Colors!!
    }

private var _Colors: ImageVector? = null


public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null

public val Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(0f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()
        return _Cash!!
    }

private var _Cash: ImageVector? = null

