package com.exemplo.meuapp.models

import java.io.Serializable

data class Solo(
    val nitrogenio: Double,
    val fosforo: Double,
    val potassio: Double,
    val calcio: Double,
    val magnesio: Double,
    val boro: Double,
    val zinco: Double,
    val cobre: Double,
    val manganes: Double,
    val ferro: Double,
    val aluminio: Double,
    val hAl: Double
) : Serializable
