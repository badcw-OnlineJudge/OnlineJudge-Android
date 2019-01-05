package top.verly_badcw.util;

import java.util.List;

import top.verly_badcw.api.function.Login;

public class User {
    private String userName;
    private String passWord;
    private String realName;
    private String photoInfo;
    private List<Integer> solvedProblems;
    private int rank;

    /*
    * 0: Regular
    * 1: Admin
    * 2: SuperAdmin
    * */
    private int userType;

    private int getInfo() {
        return Login.login();
    }

    public int refresh() {
        if (userName == null || passWord == null
                || userName.equals("") || passWord.equals("")) {
            return -1;
        }
        int statusCode = getInfo();
        return statusCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhotoInfo() {
        return photoInfo;
    }

    public void setPhotoInfo(String photoInfo) {
        this.photoInfo = photoInfo;
    }

    public List<Integer> getSolvedProblems() {
        return solvedProblems;
    }

    public void setSolvedProblems(List<Integer> solvedProblems) {
        this.solvedProblems = solvedProblems;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
