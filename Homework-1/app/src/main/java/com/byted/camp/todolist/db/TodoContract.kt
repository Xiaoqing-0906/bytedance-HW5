package com.byted.camp.todolist.db

import android.provider.BaseColumns

object TodoContract {
    //创建数据库表
    const val SQL_CREATE_NOTES = ("CREATE TABLE " + TodoNote.TABLE_NAME
            + "(" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TodoNote.COLUMN_DATE + " INTEGER, "
            + TodoNote.COLUMN_STATE + " INTEGER, "
            + TodoNote.COLUMN_CONTENT + " TEXT, "
            + TodoNote.COLUMN_PRIORITY + " INTEGER)")

    //添加数据
    const val SQL_ADD_PRIORITY_COLUMN = "ALTER TABLE " + TodoNote.TABLE_NAME + " ADD " + TodoNote.COLUMN_PRIORITY + " INTEGER"

    //数据库表字段
    object TodoNote {
        const val _ID = "_id"
        const val _COUNT = "_count"
        const val TABLE_NAME = "note"
        const val COLUMN_DATE = "date"
        const val COLUMN_STATE = "state"
        const val COLUMN_CONTENT = "content"
        const val COLUMN_PRIORITY = "priority"
    }
}