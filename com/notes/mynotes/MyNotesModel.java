package com.notes.mynotes;

import com.notes.dto.Notes;
import com.notes.repository.Repository;

import javax.swing.*;
import java.util.List;

class MyNotesModel implements MyNotesModelCallBack{
    private MyNotesControllerModelCallBack myNotesController;
    private Repository repository;
    public MyNotesModel(MyNotesControllerModelCallBack myNotesController) {
        this.myNotesController=myNotesController;
        this.repository=Repository.getInstance();
    }

    @Override
    public void deleteAllNotes(String user, String folderName) {
        List<Notes> notes=repository.deleteAllNotes(user,folderName);
        if(notes.isEmpty()){
            myNotesController.deletedAllNotesSuccessfully();
        }else {
            myNotesController.deletionOfAllNotesFailed("Something went wrong.Try again");
        }
    }

    @Override
    public void getAllNotesNameForCreating(String user, String folderName) {
        List<String> notesTitle=repository.getAllNotesName(user,folderName);
        myNotesController.getNewNotesDetail(notesTitle);
    }

    @Override
    public void addNewNotes(String user, String folderName, Notes notes) {
        Notes note=repository.addNewNotes(user,folderName,notes);
        if(note==null){
            myNotesController.addNewNotesFailed("Something went wrong.Try again");
        }else {
            myNotesController.newNotesAddedSuccessfully();
        }
    }

    @Override
    public void getAllNotesNameForUpdating(String user, String folderName) {
        List<String> notesTitle=repository.getAllNotesName(user,folderName);
        myNotesController.getUpdateNotesDetail(notesTitle);
    }

    @Override
    public void getUpdatingNotes(String user, String folderName, String title) {
        Notes notes=repository.getNotes(user,folderName,title);
        if(notes==null){
            myNotesController.getUpdatingNotesFailed("Something went wrong.Try again");
        }else {
            myNotesController.getUpdateNotesContent(notes);
        }
    }

    @Override
    public void updateNotes(String user, String folderName, Notes updateNotes, Notes notes) {
        Notes updatednotes=repository.updateNotes(user,folderName,updateNotes,notes);
        if(updatednotes==null){
            myNotesController.updateNotesFailed("Something went wrong.Try again");
        }else {
            myNotesController.updateNotesSuccessfully();
        }
    }

    @Override
    public void getAllNotesNameForViewing(String user, String folderName) {
        List<String> notesList=repository.getAllNotesName(user,folderName);
        myNotesController.getViewNotesDetails(notesList);
    }

    @Override
    public void getViewNotes(String user, String folderName, String notesTitle) {
        Notes notes=repository.getNotes(user,folderName,notesTitle);
        if(notes==null){
            myNotesController.getViewNotesFailed("Something went wrong");
        }else {
            myNotesController.getViewNotesSuccessfully(notes);
        }
    }

    @Override
    public void getAllNotesNameForDeleting(String user, String folderName) {
        List<String> notesList=repository.getAllNotesName(user,folderName);
        myNotesController.getDetetingNotesDetail(notesList);
    }

    @Override
    public void deleteNotes(String user, String folderName, String notesTitle) {
        Notes notes=repository.deleteNotes(user,folderName,notesTitle);
        if(notes==null){
            myNotesController.deleteNotesFailed("Something went wrong");
        }else {
            myNotesController.deleteNotesSuccessfully();
        }
    }

}
