package com.example.notekeeper

/**
 * Stores the data for a Course.
 * @param courseId The ID of the course.
 * @param title The title of the course.
 */
data class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

/**
 * Holds notes.
 * @param course Course associated with the note.
 * @param title The title of the note.
 * @param text The body of the note.
 */
class NoteInfo (var course: CourseInfo, var title: String, var text: String)