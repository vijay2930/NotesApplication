package com.notes.folder;

interface MyFolderControllerViewCallBack {
    void createNewFolder(String user, String name);

    void getUpdateFolderNames(String user);

    void updateFolderName(String user, String oldFolderName, String newFolderName);

    void getDeleteFolderNames(String user);

    void deleteFolder(String user, String folderName);

    void viewAllFolders(String user);

    void deleteAllFolders(String user);

    void getSelectedFolderNames(String user);
}
