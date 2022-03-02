package com.rezababaei.jetnote.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.rezababaei.jetnote.model.Note
@RequiresApi(Build.VERSION_CODES.O)
class NotesDataSource {

    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A Good Day", description = "We went on a vacation by the lake"),
            Note(title = "Android Compose", description = "Working on android compose Course which is very useful"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
            Note(title = "Android Compose", description = "Working on android compose Course"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
            Note(title = "Jetpack", description = "i will finish it and get to the office"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
        )
    }
}