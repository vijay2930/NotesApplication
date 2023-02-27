package com.notes.mynotes;

import com.notes.dto.Notes;

import java.util.List;

interface MyNotesViewCallBack {

    void deletedAllNotesSuccessfully();

    void deletionOfAllNotes(String msg);

    void getNewNotesDetails(List<String> notesTitle);

    void newNotesAddedSuccessfully();

    void addNewNotesFailed(String msg);

    void getUpdateNotesDetail(List<String> notesTitle);

    void getUpdatingNotesFailed(String msg);

    void getUpdateNotesContent(Notes notes);

    void updateNotesFailed(String msg);

    void updateNotesSuccessfully();

    void getViewNotesDetails(List<String> notesList);

    void getViewNotesFailed(String msg);

    void getViewNotesSuccessfully(Notes notes);

    void getDeletingNotesDetail(List<String> notesList);

    void deleteNotesFailed(String msg);

    void deleteNotesSuccessfully();
}
