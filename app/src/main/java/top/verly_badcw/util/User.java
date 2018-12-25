package top.verly_badcw.util;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static String username;
    private static int loginCode;
    private static int permission;
    private static List<Integer> solvedProblems = new ArrayList<>();
    private static int rank;


    public static void initInfo() {
        ;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static int getLoginCode() {
        return loginCode;
    }

    public static void setLoginCode(int loginCode) {
        User.loginCode = loginCode;
    }

    public static int getPermission() {
        return permission;
    }

    public static void setPermission(int permission) {
        User.permission = permission;
    }

    public static List<Integer> getSolvedProblems() {
        return solvedProblems;
    }

    public static void setSolvedProblems(List<Integer> solvedProblems) {
        User.solvedProblems = solvedProblems;
    }

    public static int getRank() {
        return rank;
    }

    public static void setRank(int rank) {
        User.rank = rank;
    }
}
