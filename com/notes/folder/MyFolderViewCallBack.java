package com.notes.folder;

import com.notes.dto.Folder;

import java.util.List;

interface MyFolderViewCallBack {
    void newFolderCreationFailed(String msg);

    void newFolderCreationSuccessfully(String folderName);


    void getNewFolderName(List<String> folderName);

    void updateFolderNameFailed(String msg);

    void folderNameUpdatedSuccessfully(String name);

    void getDeleteFolderName(List<String> folderNames);

    void folderDeletionFailed(String msg);

    void folderDeletedSuccessfully(String name);

    void listAllFolders(List<Folder> folders);

    void deleteAllFoldersFailed(String msg);

    void deleteAllFoldersSuccessfully();

    void getSelectedFolderName(List<String> folders);
}
