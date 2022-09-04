package com.company;

public enum DaysOfWeek {
    MONDAY("Дуйшомбу куну жава сабагы болот"),
    TUESDAY("Шейшемби куну жава-практика сабагы болот"),
    WEDNESDAY("Шаршемби куну англис тил жана жава-теория сабагы болот"),
    THRUSDAY("Жекшемби куну жава-практика сабагы болот"),
    FRIDAY("Жума куну жава-практика жана англис тил сабагы болот"),
    SATURDAY("Ишемби куну эс алуу кун"),
    SUNDAY("Жекшемби куну эс алуу кун");
    private  String day;

    DaysOfWeek(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }

}
