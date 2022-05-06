package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Aron Milston", "0629841123",  1, 2,false),
            NoteDbModel(2, "Barkly Woods", "0684557887",  2, 2,false),
            NoteDbModel(3, "Johnny Crew", "0924563214",  3, 2,false),
            NoteDbModel(4, "Wilton Farrel", "0858997135", 4,2, false),
            NoteDbModel(5, "Zoe Wills", "0879445123", 4,2, false),
        )
    }
}
