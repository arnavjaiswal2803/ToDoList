package com.example.todolist.data;

import android.provider.BaseColumns;

/**
 * API Contract for the To Do List app.
 */
public final class ToDoListContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ToDoListContract() {
    }

    /**
     * Inner class that defines constant values for the ToDoList database table.
     * Each entry in the table represents a single To Do.
     */
    public static final class ToDoListEntry implements BaseColumns {

        /** Name of database table for ToDoList */
        public static final String TABLE_NAME = "ToDoList";

        /**
         * Unique ID number for the ToDoList (only for use in the database table).
         *
         * Type: INTEGER
         */
        public static final String _ID = BaseColumns._ID;

        /**
         * Description of the To-Do.
         *
         * Type: TEXT
         */
        public static final String COLUMN_TODO_DESCRIPTION = "description";
    }
}
