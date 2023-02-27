package com.notes.folder;

import com.notes.dto.Folder;

import java.util.List;

interface MyFolderControllerModelCallBack {

    void newFolderCreationFailed(String msg);

    void newFolderCreatedSuccessfully(String folderName);


    void getNewFolderName(List<String> folderNames);

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
