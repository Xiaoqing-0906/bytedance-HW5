package com.byted.camp.todolist.beans

import java.util.*

data class Note (val id: Long = 0,
                 ){
    var date: Date? = null
    var state: State? = null
    var content: String? = null
    var priority: Priority? = null

}