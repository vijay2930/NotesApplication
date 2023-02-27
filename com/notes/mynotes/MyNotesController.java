package com.notes.mynotes;

import com.notes.dto.Notes;

import java.util.List;

class MyNotesController implements MyNotesControllerViewCallBack,MyNotesControllerModelCallBack{
    private MyNotesViewCallBack myNotesView;
    private MyNotesModelCallBack myNotesModel;
    public MyNotesController(MyNotesViewCallBack myNotesView) {
        this.myNotesView=myNotesView;
        this.myNotesModel=new MyNotesModel(this);
    }

    @Override
    public void deleteAllNotes(String user, String folderName) {
        myNotesModel.deleteAllNotes(user,folderName);
    }

    @Override
    public void getAllNotesNameForCreating(String user, String folderName) {
        myNotesModel.getAllNotesNameForCreating(user,folderName);
    }

    @Override
    public void addNewNotes(String user, String folderName, Notes notes) {
        myNotesModel.addNewNotes(user,folderName , notes);
    }

    @Override
    public void getAllNotesNameForUpdating(String user, String folderName) {
        myNotesModel.getAllNotesNameForUpdating(user,folderName);
    }

    @Override
    public void getUpdatingNotes(String user, String folderName, String title) {
        myNotesModel.getUpdatingNotes(user,folderName,title);
    }

    @Override
    public void updateNotes(String user, String folderName, Notes updateNotes, Notes notes) {
        myNotesModel.updateNotes(user,folderName,updateNotes,notes);
    }

    @Override
    public void getAllNotesNameForViewing(String user, String folderName) {
        myNotesModel.getAllNotesNameForViewing(user,folderName);
    }

    @Override
    public void getViewNotes(String user, String folderName, String notesTitle) {
        myNotesModel.getViewNotes(user,folderName,notesTitle);
    }

    @Override
    public void getAllNotesNameForDeleting(String user, String folderName) {
        myNotesModel.getAllNotesNameForDeleting(user,folderName);
    }

    @Override
    public void deleteNotes(String user, String folderName, String notesTitle) {
        myNotesModel.deleteNotes(user,folderName,notesTitle);
    }

    @Override
    public void deletedAllNotesSuccessfully() {
        myNotesView.deletedAllNotesSuccessfully();
    }

    @Override
    public void deletionOfAllNotesFailed(String msg) {
        myNotesView.deletionOfAllNotes(msg);
    }

    @Override
    public void getNewNotesDetail(List<String> notesTitle) {
        myNotesView.getNewNotesDetails(notesTitle);
    }

    @Override
    public void newNotesAddedSuccessfully() {
        myNotesView.newNotesAddedSuccessfully();
    }

    @Override
    public void addNewNotesFailed(String msg) {
        myNotesView.addNewNotesFailed(msg);
    }

    @Override
    public void getUpdateNotesDetail(List<String> notesTitle) {
        myNotesView.getUpdateNotesDetail(notesTitle);
    }

    @Override
    public void getUpdatingNotesFailed(String msg) {
        myNotesView.getUpdatingNotesFailed(msg);
    }

    @Override
    public void getUpdateNotesContent(Notes notes) {
        myNotesView.getUpdateNotesContent(notes);
    }

    @Override
    public void updateNotesFailed(String msg) {
        myNotesView.updateNotesFailed(msg);
    }
    @Override
    public void updateNotesSuccessfully() {
        myNotesView.updateNotesSuccessfully();
    }

    @Override
    public void getViewNotesDetails(List<String> notesList) {
        myNotesView.getViewNotesDetails(notesList);
    }

    @Override
    public void getViewNotesFailed(String msg) {
        myNotesView.getViewNotesFailed(msg);
    }

    @Override
    public void getViewNotesSuccessfully(Notes notes) {
        myNotesView.getViewNotesSuccessfully(notes);
    }

    @Override
    public void getDetetingNotesDetail(List<String> notesList) {
        myNotesView.getDeletingNotesDetail(notesList);
    }

    @Override
    public void deleteNotesFailed(String msg) {
        myNotesView.deleteNotesFailed(msg);
    }

    @Override
    public void deleteNotesSuccessfully() {
        myNotesView.deleteNotesSuccessfully();
    }
}
