package com.rezababaei.jetnote.model

import android.os.Build.VERSION_CODES.O
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.util.*


@RequiresApi(O)
data class Note(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now(),
)

