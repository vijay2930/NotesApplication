package com.notes.folder;

import com.notes.dto.Folder;

import java.util.List;

class MyFolderController implements MyFolderControllerViewCallBack, MyFolderControllerModelCallBack {
    private MyFolderViewCallBack myFolderView;
    private MyFolderModelCallBack myFolderModel;
    public MyFolderController(MyFolderViewCallBack myFolderView) {
        this.myFolderView =myFolderView;
        this.myFolderModel =new MyFolderModel(this);
    }

    @Override
    public void createNewFolder(String user, String newFolderName) {
        myFolderModel.createNewFolder(user,newFolderName);
    }

    @Override
    public void getUpdateFolderNames(String user) {
        myFolderModel.getUpdateFolderNames(user);
    }

    @Override
    public void updateFolderName(String user, String oldFolderName, String newFolderName) {
        myFolderModel.updateFolderName(user,oldFolderName,newFolderName);
    }

    @Override
    public void getDeleteFolderNames(String user) {
        myFolderModel.getDeleteFolderNames(user);
    }

    @Override
    public void deleteFolder(String user, String folderName) {
        myFolderModel.deleteFolder(user,folderName);
    }

    @Override
    public void viewAllFolders(String user) {
        myFolderModel.viewAllFolders(user);
    }

    @Override
    public void deleteAllFolders(String user) {
        myFolderModel.deleteAllFolders(user);
    }

    @Override
    public void getSelectedFolderNames(String user) {
        myFolderModel.getSelectedFolderNames(user);
    }

    @Override
    public void newFolderCreationFailed(String msg) {
        myFolderView.newFolderCreationFailed(msg);
    }

    @Override
    public void newFolderCreatedSuccessfully(String folderName) {
        myFolderView.newFolderCreationSuccessfully(folderName);
    }


    @Override
    public void getNewFolderName(List<String> folderNames) {
        myFolderView.getNewFolderName(folderNames);
    }

    @Override
    public void updateFolderNameFailed(String msg) {
        myFolderView.updateFolderNameFailed(msg);
    }

    @Override
    public void folderNameUpdatedSuccessfully(String name) {
        myFolderView.folderNameUpdatedSuccessfully(name);
    }

    @Override
    public void getDeleteFolderName(List<String> folderNames) {
        myFolderView.getDeleteFolderName(folderNames);
    }

    @Override
    public void folderDeletionFailed(String msg) {
        myFolderView.folderDeletionFailed(msg);
    }

    @Override
    public void folderDeletedSuccessfully(String name) {
        myFolderView.folderDeletedSuccessfully(name);
    }

    @Override
    public void listAllFolders(List<Folder> folders) {
        myFolderView.listAllFolders(folders);
    }

    @Override
    public void deleteAllFoldersFailed(String msg) {
        myFolderView.deleteAllFoldersFailed(msg);
    }

    @Override
    public void deleteAllFoldersSuccessfully() {
        myFolderView.deleteAllFoldersSuccessfully();
    }

    @Override
    public void getSelectedFolderName(List<String> folders) {
        myFolderView.getSelectedFolderName(folders);
    }
}
