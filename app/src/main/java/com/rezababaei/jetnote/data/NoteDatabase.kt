package com.rezababaei.jetnote.data

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rezababaei.jetnote.model.Note
import com.rezababaei.jetnote.util.DateConverter
import com.rezababaei.jetnote.util.UUIDConverter


@RequiresApi(Build.VERSION_CODES.O)
@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao():NoteDatabaseDao
}
