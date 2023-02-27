package com.notes.mynotes;

import com.notes.dto.Notes;

interface MyNotesControllerViewCallBack {
    void deleteAllNotes(String user, String folderName);

    void getAllNotesNameForCreating(String user, String folderName);

    void addNewNotes(String user, String folderName, Notes notes);

    void getAllNotesNameForUpdating(String user, String folderName);

    void getUpdatingNotes(String user, String folderName, String title);

    void updateNotes(String user, String folderName, Notes updateNotes, Notes notes);

    void getAllNotesNameForViewing(String user, String folderName);

    void getViewNotes(String user, String folderName, String notesTitle);

    void getAllNotesNameForDeleting(String user, String folderName);

    void deleteNotes(String user, String folderName, String notesTitle);
}
