package com.notes.mynotes;

import com.notes.dto.Notes;

import java.util.List;

interface MyNotesControllerModelCallBack {

    void deletedAllNotesSuccessfully();

    void deletionOfAllNotesFailed(String s);

    void getNewNotesDetail(List<String> notesTitle);

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

    void getDetetingNotesDetail(List<String> notesList);

    void deleteNotesFailed(String msg);

    void deleteNotesSuccessfully();
}
