package com.notes.folder;

import com.notes.dto.Folder;
import com.notes.repository.Repository;

import java.util.List;

class MyFolderModel implements MyFolderModelCallBack {
    private MyFolderControllerModelCallBack myFolderController;
    private Repository repository;
    public MyFolderModel(MyFolderControllerModelCallBack myNotesController) {
        this.myFolderController =myNotesController;
        this.repository=Repository.getInstance();
    }
    @Override
    public void createNewFolder(String user, String folderName) {
        Folder myFolder=repository.createFolder(user,folderName);
        if(myFolder==null){
            myFolderController.newFolderCreationFailed("Folder Name Already Exits.Try Another name.");
        }else {
            myFolderController.newFolderCreatedSuccessfully(myFolder.getName());
        }
    }

    @Override
    public void getUpdateFolderNames(String user) {
        List<String> folderNames=repository.getFolderNames(user);
        myFolderController.getNewFolderName(folderNames);
    }

    @Override
    public void updateFolderName(String user, String oldFolderName, String newFolderName) {
        Folder myFolder=repository.updateFolderName(user,oldFolderName,newFolderName);
        if(myFolder==null){
            myFolderController.updateFolderNameFailed("Something went wrong.");
        }else {
            myFolderController.folderNameUpdatedSuccessfully(myFolder.getName());
        }
    }

    @Override
    public void getDeleteFolderNames(String user) {
        List<String> folderNames=repository.getFolderNames(user);
        myFolderController.getDeleteFolderName(folderNames);
    }

    @Override
    public void deleteFolder(String user, String folderName) {
        Folder myFolder=repository.deleteFolder(user,folderName);
        if(myFolder==null){
            myFolderController.folderDeletionFailed("Something went Wrong.");
        }else {
            myFolderController.folderDeletedSuccessfully(myFolder.getName());
        }

    }

    @Override
    public void viewAllFolders(String user) {
        List<Folder> folders=repository.getFolders(user);
        myFolderController.listAllFolders(folders);
    }

    @Override
    public void deleteAllFolders(String user) {
        List<Folder> folders=repository.deleteAllFolders(user);
        if(folders.isEmpty()){
            myFolderController.deleteAllFoldersSuccessfully();
        }else {
            myFolderController.deleteAllFoldersFailed("Something went wrong");
        }
    }

    @Override
    public void getSelectedFolderNames(String user) {
        List<String> folders=repository.getFolderNames(user);
        myFolderController.getSelectedFolderName(folders);
    }

}
