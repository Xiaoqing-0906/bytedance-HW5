package com.byted.camp.todolist

import com.byted.camp.todolist.beans.Note

interface NoteOperator {
    fun deleteNote(note: Note?)
    fun updateNote(note: Note?)
}