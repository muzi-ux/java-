package com.Dome03.Buffered;

public class FileString implements Comparable<FileString>{
    private String str;

    public FileString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(FileString o) {
        return  this.str.charAt(0) - o.str.charAt(0);
    }

    @Override
    public String toString() {
//        return "FileString{" +
//                "str='" + str + '\'' +
//                '}';
        return str;
    }
}
